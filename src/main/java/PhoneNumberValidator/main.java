package PhoneNumberValidator;

/*
 * @created - 09/06/2023
 * @project - zimbabwean-phone-number-validator
 * @author - anesuphiri - sehphirry@gmail.com
 */

import PhoneNumberValidator.service.ValidatePhoneNumber;

public class main {

    //Example
    public static void main(String[] args) {
        ValidatePhoneNumber validatePhoneNumber = new ValidatePhoneNumber();
        System.out.println(validatePhoneNumber.validate("071 451 1430").toString());
    }
}
