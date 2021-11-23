package combinatorPattern;

import java.time.LocalDate;
import java.util.List;

import static combinatorPattern.CustomerRegistrationValidator.*;

public class Main {
    
    public static void main(String[] args) {
        Customer customer = new Customer(
                "Alice",
                "alice@gmail.com",
                "+08965471235458",
                LocalDate.of(2015,1,1)
        );
    
        //System.out.println(new CustomerValidatorService().isValid(customer));
        
        // if valid we can store customer in db
        
        // Using combinator pattern
        ValidationResult result = isEmailValid()
                .and(isPhoneNumberValid())
                .and(isAdult())
                .apply(customer);
    
        System.out.println(result);
        
        if (result != ValidationResult.SUCCESS){
            throw  new IllegalStateException(result.name());
        }
    }
}