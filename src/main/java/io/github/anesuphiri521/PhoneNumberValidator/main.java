package io.github.anesuphiri521.PhoneNumberValidator;

/*
 * @created - 09/06/2023
 * @project - zimbabwean-phone-number-validator
 * @author - anesuphiri - sehphirry@gmail.com
 */

import io.github.anesuphiri521.PhoneNumberValidator.model.ValidationResponse;
import io.github.anesuphiri521.PhoneNumberValidator.service.ValidatePhoneNumber;

public class main {

    //Example
    public static void main(String[] args) {
        ValidationResponse response = new ValidatePhoneNumber().validate("07XXXXXXX");
        System.out.println(response);
        if (response.isValid()){
            //Business Logic when phone number is valid
        }else {
            //Phone number is not valid
        }
    }
}
