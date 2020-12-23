package com.company.validator_rules;

public interface ValidatorRule <T>{
    boolean validate(T value);
    String errorMessage();
}
