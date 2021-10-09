package combinatorPattern;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.Function;

import static combinatorPattern.customerRegistrationValidator.validationResults.*;


public interface customerRegistrationValidator extends Function<Customer, customerRegistrationValidator.validationResults> {

    // creating validators using functional programming
    static customerRegistrationValidator isEmailValid(){
        return customer -> customer.getEmail().contains("@") ?
                success:email_not_valid;
    }

    static customerRegistrationValidator isPhoneValid(){
        return customer -> customer.getPhoneNumber().contains("024") ?
                success:phone_number_not_valid;
    }

    static customerRegistrationValidator isAdult(){
        return customer -> Period.between(customer.getDob(), LocalDate.now()).getYears() > 16 ?
                success:is_not_an_adult;
    }

    default customerRegistrationValidator and (customerRegistrationValidator other){
        return customer -> {
            validationResults results = this.apply(customer);
            return results.equals(success) ? other.apply(customer) :results;
        };
    }

    enum validationResults{
        success,
        phone_number_not_valid,
        email_not_valid,
        is_not_an_adult
    }

}
