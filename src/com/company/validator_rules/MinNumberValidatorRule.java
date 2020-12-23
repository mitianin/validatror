package com.company.validator_rules;

public class MinNumberValidatorRule implements ValidatorRule<Number> {
    private Number minValue;

    public MinNumberValidatorRule(Number minValue) {
        this.minValue = minValue;
    }


    @Override
    public boolean validate(Number value) {

        return Double.parseDouble(minValue.toString()) < Double.parseDouble(value.toString());
    }

    @Override
    public String errorMessage() {
        return "Error. Number is less than " + minValue;
    }

}
