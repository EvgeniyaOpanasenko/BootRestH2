package com.example.controller;

import org.springframework.util.MultiValueMap;

public class ErrorException extends Exception {
    public ErrorException(String message) {
        super(message);
    }
}
