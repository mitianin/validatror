package com.company.validator_rules;

import java.util.regex.Pattern;

public class RegExpValidatorRule implements ValidatorRule<String> {
    private Pattern pattern;

    public RegExpValidatorRule(Pattern pattern) {
        this.pattern = pattern;
    }

    @Override
    public boolean validate(String value) {
        return value.matches(pattern.pattern());
    }

    @Override
    public String errorMessage() {
        return "Error. Number is not compatible with pattern " + pattern.pattern();
    }
}
