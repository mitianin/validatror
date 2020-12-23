package com.company;

import com.company.validator_rules.*;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        List<ValidatorRule<Number>> list = new ArrayList<>();

        list.add(new MinNumberValidatorRule(17));
        list.add(new MaxNumberValidatorRule(23));

        ObjectValidator<Number> numberValidator = new RulesBasedObjectValidator<>(list);

        try {
            numberValidator.validate(11);
        } catch (ValidatorException e) {
            System.out.println(e.getMessage());
        }

        List<ValidatorRule<String>> list2 = new ArrayList<>();
        list2.add(new StartsWithValidatorRule("+380"));
        list2.add(new RegExpValidatorRule(Pattern.compile("\\+\\d{12}")));

        ObjectValidator<String> stringValidator = new RulesBasedObjectValidator<>(list2);

        try {
            stringValidator.validate("+380975070050");
        } catch (ValidatorException e) {
            System.out.println(e.getMessage());
        }





    }


}
