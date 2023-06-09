package PhoneNumberValidator;/*
 * @created - 09/06/2023
 * @project - zimbabwean-phone-number-validator
 * @author - anesuphiri - sehphirry@gmail.com
 */

public class main {
    public static void main(String[] args) {
        ValidatePhoneNumber validatePhoneNumber = new ValidatePhoneNumber();
        System.out.println(validatePhoneNumber.validate(" 77 927 8524").toString());
    }
}
