package com.company.validator_rules;


public class MaxNumberValidatorRule implements ValidatorRule<Number> {
    private Number maxValue;

    public MaxNumberValidatorRule(Number maxValue) {
        this.maxValue = maxValue;
    }

    @Override
    public boolean validate(Number value) {
        return Double.parseDouble(maxValue.toString()) > Double.parseDouble(value.toString());
    }

    @Override
    public String errorMessage() {

        return "Error. Number is bigger than " + maxValue;
    }

}
