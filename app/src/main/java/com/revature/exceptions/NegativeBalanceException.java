package com.revature.exceptions;

public class NegativeBalanceException extends Exception {
    public NegativeBalanceException(){
        super("Error: This transaction would result in negative account balance");
    }
    public NegativeBalanceException(String message){
        super(message);
    }
}
