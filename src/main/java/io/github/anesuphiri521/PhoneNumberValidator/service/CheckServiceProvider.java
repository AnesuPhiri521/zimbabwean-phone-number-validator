package io.github.anesuphiri521.PhoneNumberValidator.service;

/*
 * @created - 10/06/2023
 * @project - zimbabwean-phone-number-validator
 * @author - anesuphiri - sehphirry@gmail.com
 */

import io.github.anesuphiri521.PhoneNumberValidator.model.ServiceProviderCheck;
import io.github.anesuphiri521.PhoneNumberValidator.utils.ServiceProviders;

public class CheckServiceProvider {

    public ServiceProviderCheck checkProvider(String phoneNumber) {
        if (phoneNumber.startsWith("0"))
            phoneNumber=phoneNumber.replaceFirst("0", "");
        else if (phoneNumber.startsWith("263"))
            phoneNumber=phoneNumber.replaceFirst("263", "");

        return checkEconetNetoneTelecel(phoneNumber);
    }

    private ServiceProviderCheck checkEconetNetoneTelecel(String phoneNumber) {
        if (phoneNumber.startsWith("77") || phoneNumber.startsWith("78"))
            return ServiceProviderCheck.builder().serviceProvider(ServiceProviders.Econet).valid(true).build();
        else if (phoneNumber.startsWith("73"))
            return ServiceProviderCheck.builder().serviceProvider(ServiceProviders.Telecel).valid(true).build();
        else if (phoneNumber.startsWith("71"))
            return ServiceProviderCheck.builder().serviceProvider(ServiceProviders.Netone).valid(true).build();
        else return ServiceProviderCheck.builder().valid(false).build();
    }
}
