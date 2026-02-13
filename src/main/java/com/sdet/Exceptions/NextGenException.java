package com.sdet.Exceptions;

public class NextGenException extends Exception {

    public NextGenException(String message) {
        super("Next Gen Exception :: " +  message);
    }
}
