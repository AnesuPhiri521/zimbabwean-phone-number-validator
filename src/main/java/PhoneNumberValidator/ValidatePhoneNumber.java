package PhoneNumberValidator;
/*
 * @created - 09/06/2023
 * @project - zimbabwean-phone-number-validator
 * @author - anesuphiri - sehphirry@gmail.com
 */

import PhoneNumberValidator.model.ValidationResponse;

import static PhoneNumberValidator.utils.Constants.*;

public class ValidatePhoneNumber {
    public ValidationResponse validate(String phoneNumber){
        phoneNumber=phoneNumber.replace(" ", "").trim();
        if (phoneNumber.startsWith("0") || phoneNumber.startsWith("263") || phoneNumber.startsWith("+263") || phoneNumber.startsWith("7"))
            return validatePhoneNumber(phoneNumber);
        else{
            return ValidationResponse.builder()
                    .message(inValidPhoneNumber)
                    .status(false)
                    .phoneNumberLength(phoneNumber.length())
                    .build();
        }
    }

    private ValidationResponse validatePhoneNumber(String phoneNumber) {
        if(phoneNumber.startsWith("0") && phoneNumber.length() == 10){
            return checkIfContainsNumbers(phoneNumber);
        } else if(phoneNumber.startsWith("263") && phoneNumber.length() == 12){
            return checkIfContainsNumbers(phoneNumber);
        }else if(phoneNumber.startsWith("+263") && phoneNumber.length() == 13){
            phoneNumber = phoneNumber.replace("+","");
            return checkIfContainsNumbers(phoneNumber);
        }else if(phoneNumber.startsWith("7") && phoneNumber.length() == 9){
            return checkIfContainsNumbers(phoneNumber);
        } else{
            return ValidationResponse.builder()
                    .message(inValidPhoneNumber)
                    .status(false)
                    .phoneNumberLength(phoneNumber.length())
                    .build();

        }
    }

    private ValidationResponse checkIfContainsNumbers(String phoneNumber) {
        if(phoneNumber.matches("\\d+")){
            return ValidationResponse.builder()
                    .message(validPhoneNumber)
                    .status(true)
                    .phoneNumberLength(phoneNumber.length())
                    .build();
        }else{
            return ValidationResponse.builder()
                    .message(inValidPhoneNumberCharacters)
                    .status(false)
                    .phoneNumberLength(phoneNumber.length())
                    .build();
        }
    }

}
