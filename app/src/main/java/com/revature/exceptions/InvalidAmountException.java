package com.revature.exceptions;

public class InvalidAmountException extends Exception {
    public InvalidAmountException(){
        super("Error: Transaction amount must be > 0");
    }

    public InvalidAmountException(String message){
        super(message);
    }
}
