package com.company.validator_rules;

public class StartsWithValidatorRule implements ValidatorRule<String> {

    private String start;

    public StartsWithValidatorRule(String start) {
        this.start = start;
    }

    @Override
    public boolean validate(String value) {
        return value.startsWith(start);
    }

    @Override
    public String errorMessage() {
        return "Error. Number not starts with " + start;
    }
}
