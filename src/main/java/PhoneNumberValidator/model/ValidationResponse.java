package PhoneNumberValidator.model;

/*
 * @created - 09/06/2023
 * @project - zimbabwean-phone-number-validator
 * @author - anesuphiri - sehphirry@gmail.com
 */

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@ToString
public class ValidationResponse {
    private boolean status;
    private String message;
    private int phoneNumberLength;
}
