/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validator.Validators;

import Validator.Validator;

/**
 *
 * @author PC
 */
public class MaxLengthValidator extends Validator<String, Integer> {

    public MaxLengthValidator(Integer payload) {
        super(payload);
    }

    @Override
    public boolean validate(String field) {

        boolean res = false;

        if (this.payload != null && field != null) {
            res = field.length() <= this.payload;
        }

        return res;
    }

}
