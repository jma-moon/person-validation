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
public class MaxValidator extends Validator<Integer, Integer> {

    public MaxValidator(Integer payload) {
        super(payload);
    }

    @Override
    public boolean validate(Integer field) {

        boolean res = false;

        if (this.payload != null && field != null) {
            res = field <= this.payload;
        }

        return res;
    }

}
