package com.sdet.seleniumBasics;

import org.openqa.selenium.*;

public class LocatorHealer {

    public static WebElement heal(
            WebDriver driver,
            By failedLocator)
            throws Exception {

        String dom =
                driver.getPageSource();

        String prompt =
                """
                Failed Locator:
                %s

                HTML:
                %s

                Suggest xpath only.
                """
                        .formatted(
                                failedLocator,
                                dom);

        String response =
                OllamaClient.ask(prompt);

        String xpath =
                extractXpath(response);

        return driver.findElement(
                By.xpath(xpath));
    }

    private static String extractXpath(
            String response) {

        return response
                .replace("\"", "")
                .trim();
    }
}
