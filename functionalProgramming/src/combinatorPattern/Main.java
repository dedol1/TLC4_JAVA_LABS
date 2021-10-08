package combinatorPattern;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Customer customer1 = new Customer(
                "Samuel Afotey Laryea", "afoteylaryeasamuel@gmail.com",
                "0242144437", LocalDate.of(1995,05,13));

        // creating an object for the validator serveice

        customerValidationService validatorService = new customerValidationService();
        validatorService.isValid(customer1);

        System.out.println(validatorService.isValid(customer1));

    }
}
