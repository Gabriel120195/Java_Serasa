package br.com.grs.wisedelivery.exception;

public class SenhaInvalidaException extends RuntimeException{

    public SenhaInvalidaException(String msg){
        super(msg);
    }
}