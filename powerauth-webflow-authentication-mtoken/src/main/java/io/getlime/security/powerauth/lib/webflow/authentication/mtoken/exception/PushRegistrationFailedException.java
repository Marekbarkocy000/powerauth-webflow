package io.getlime.security.powerauth.lib.webflow.authentication.mtoken.exception;

/**
 * @author Petr Dvorak, petr@lime-company.eu
 */
public class PushRegistrationFailedException extends Exception {

    public PushRegistrationFailedException() {
        super("Push registration failed.");
    }

}