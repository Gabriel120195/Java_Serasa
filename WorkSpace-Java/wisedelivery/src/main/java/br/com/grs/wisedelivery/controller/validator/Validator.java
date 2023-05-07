package br.com.grs.wisedelivery.controller.validator;

public interface Validator<T> {

    boolean validator(T t);
    
}