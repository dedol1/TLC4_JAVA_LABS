package combinatorPattern;

import java.time.LocalDate;

import static combinatorPattern.customerRegistrationValidator.*;

public class Main {
    public static void main(String[] args) {

        Customer customer1 = new Customer(
                "Samuel Afotey Laryea", "afoteylaryeasamuel@gmail.com",
                "0242144437", LocalDate.of(1995,05,13));

        // creating an object for the validator serveice

        customerValidationService validatorService = new customerValidationService();
        validatorService.isValid(customer1);

        System.out.println(validatorService.isValid(customer1));


        // using the validator created using the combination pattern

        validationResults results = isEmailValid()
                .and(isPhoneValid())
                .and(isAdult()).apply(customer1);

        System.out.println(results);

        if (results != validationResults.success){

            throw new IllegalStateException(results.name());
        };
    }
}
