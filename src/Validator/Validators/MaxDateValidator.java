/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validator.Validators;

import Validator.Validator;
import java.util.Date;

/**
 *
 * @author PC
 */
public class MaxDateValidator extends Validator<Date, Date> {

    public MaxDateValidator(Date payload) {
        super(payload);
    }

    @Override
    public boolean validate(Date field) {

        boolean res = false;

        if (this.payload != null && field != null) {
            res = this.payload.compareTo(field) >= 0;
        }

        return res;
    }

}
