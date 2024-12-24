package org.sanaa.brif10.majesticcup.exception;

public class UsernameAlreadyExistsException extends RuntimeException {
    public UsernameAlreadyExistsException(String username) {
        super(username);
    }
}
