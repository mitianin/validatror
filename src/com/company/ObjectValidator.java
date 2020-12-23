package com.company;

interface ObjectValidator <T>{
    void validate(T o) throws ValidatorException;
}
