package optionals;

import java.util.Optional;

public class Main {
    
    public static void main(String[] args) {
        Object value = Optional.ofNullable("Hello")
                .orElseGet(() -> "default value");
    
        System.out.println(value);
    
        Optional.ofNullable("Hello")
                .orElseThrow(() -> new IllegalStateException("exception"));
    
        //logic
        Optional.ofNullable(null)
                        .ifPresentOrElse(
                                email -> System.out.println("Sending email to " + email),
                                () -> System.out.println("Cannot send email"));
    
        
    }
}
