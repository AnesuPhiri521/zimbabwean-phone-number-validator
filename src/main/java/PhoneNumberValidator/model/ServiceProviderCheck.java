package PhoneNumberValidator.model;

/*
 * @created - 10/06/2023
 * @project - zimbabwean-phone-number-validator
 * @author - anesuphiri - sehphirry@gmail.com
 */

import PhoneNumberValidator.utils.ServiceProviders;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@ToString
public class ServiceProviderCheck {
    private boolean valid;
    private ServiceProviders serviceProvider;
}
