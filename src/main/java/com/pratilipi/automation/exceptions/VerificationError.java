package com.pratilipi.automation.exceptions;

/**
 * @author ankitjain
 *
 */
public class VerificationError extends Error {

    private static final long serialVersionUID = 8247563849457669512L;

    public VerificationError(String message) {
        super(message);
    }
}