package org.example.parcialcavalcanti.exception;

public class AlreadyRequestedException extends RuntimeException {
    public AlreadyRequestedException(String message) {
        super(message);
    }
}
