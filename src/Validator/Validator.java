/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validator;

/**
 *
 * @author PC
 */
public abstract class Validator<Field, Payload> implements Validate<Field> {

    protected Payload payload;

    public Validator(Payload payload) {
        this.payload = payload;
    }

}
