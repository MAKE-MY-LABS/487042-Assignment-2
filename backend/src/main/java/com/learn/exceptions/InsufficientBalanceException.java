package com.learn.exceptions;

// Create an exception class InsufficientBalanceException
public class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}
