package com.sdet.seleniumBasics;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

public class OllamaClient {

    public static String ask(String prompt)
            throws Exception {

        URL url =
                new URL(
                        "http://localhost:11434/api/generate");

        HttpURLConnection conn =
                (HttpURLConnection)
                        url.openConnection();

        conn.setRequestMethod("POST");
        conn.setDoOutput(true);

        conn.setRequestProperty(
                "Content-Type",
                "application/json");

        String json =
                """
                {
                  "model":"llama3",
                  "prompt": "%s",
                  "stream": false
                }
                """.formatted(
                        prompt.replace("\"", "\\\""));

        OutputStream os =
                conn.getOutputStream();

        os.write(json.getBytes());

        BufferedReader br =
                new BufferedReader(
                        new InputStreamReader(
                                conn.getInputStream()));

        StringBuilder response =
                new StringBuilder();

        String line;

        while((line = br.readLine()) != null)
            response.append(line);

        return response.toString();
    }
}