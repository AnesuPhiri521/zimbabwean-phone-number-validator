# zimbabwean-phone-number-validator
Java Dependency that validates Zimbabwean phone numbers

### Prerequisites
In order to make use of this project, the following prerequisites must be met for it to work.

Java JDK 7 or higher

### Installation
To use the Java Zimbabwean Phone Number Validator. 

#### Maven
``` 
<dependency>
    <groupId>io.github.anesuphiri521</groupId>
    <artifactId>zimbabwean-phone-number-validator</artifactId>
    <version>1.0.0</version>
</dependency> 
```

#### Gradle
```
implementation group: 'io.github.anesuphiri521', name: 'zimbabwean-phone-number-validator', version: '1.0.0'
```

#### Ivy
```
<dependency org="io.github.anesuphiri521" name="zimbabwean-phone-number-validator" rev="1.0.0"/>
```

### Getting started / Usage
Create an instance of `ValidatePhoneNumber` and call the method `validate(phonenumber)` with phone number as the parameter.
``` 
ValidationResponse response = new ValidatePhoneNumber().validate("07XXXXXXXX");
if (response.isStatus()){
    //Business Logic when phone number is valid
    System.out.println(response);
}else {
    //Phone number is not valid
    System.out.println(response.getMessage());
}
``` 

### Response body from validation
Response from number validation:

| Response | Explanation  |
|----------------|--------------|
| `valid`   | returns a boolean (`true`/`false`). When it's true, phone number will be valid, otherwise false |
| `message`  | narration of validation response. |
| `serviceProvider`   | This is returned when phone number is valid.<br/>Service provider for the provided phone number (Econet, Netone or Telecel). |
