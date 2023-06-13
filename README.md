# zimbabwean-phone-number-validator
Java Dependency that validates Zimbabwean phone numbers

### Prerequisites
In order to make use of this project, the following prerequisites must be met for it to work.

Java JDK 7 or higher

### Installation
To use the Java Zimbabwean Phone Number Validator, you can download 

#### Gradle
`implementation group: 'io.github.anesuphiri521', name: 'zimbabwean-phone-number-validator', version: '1.0.0'`

#### Maven
``` 
<dependency>
    <groupId>io.github.anesuphiri521</groupId>
    <artifactId>zimbabwean-phone-number-validator</artifactId>
    <version>1.0.0</version>
</dependency> 
```

#### Ivy
`<dependency org="io.github.anesuphiri521" name="zimbabwean-phone-number-validator" rev="1.0.0"/>`

### Getting started / Usage
Create an instance of `ValidatePhoneNumber` and call the method `validate(phonenumber)` with phone number as the parameter.
``` 
ValidatePhoneNumber validatePhoneNumber = new ValidatePhoneNumber();
validatePhoneNumber.validate("071 XXX XXXX").toString()
``` 

### Response from validation
Response from number validation:

`ValidationResponse(status=true, message=Phone number is valid, serviceProvider=Netone)`