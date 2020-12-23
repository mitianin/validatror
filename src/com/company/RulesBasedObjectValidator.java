package com.company;

import com.company.validator_rules.ValidatorRule;

import java.util.List;

public class RulesBasedObjectValidator<T> implements ObjectValidator<T> {

    private List<ValidatorRule<T>> rules;

    public RulesBasedObjectValidator(List<ValidatorRule<T>> rules) {
        this.rules = rules;
    }

    @Override
    public void validate(T o) throws ValidatorException {
        for (ValidatorRule<T> rule : rules
        ) {
            if (!rule.validate(o)) {
                throw new ValidatorException(rule.errorMessage());
            }
        }
    }


}
