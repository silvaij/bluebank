package br.com.bloodblue.bluebank.service.exceptions;

public class AccountErrorException extends RuntimeException {

    public AccountErrorException(String message) {
        super(message);
    }
}
