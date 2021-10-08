package Optional;

import java.util.Optional;

public class _Optional {
    public static void main(String[] args) {
        // this returns a default set value when the right one is not set
        Object value = Optional.ofNullable(null)
                .orElseGet(() -> "default value");

        System.out.println(value);

        // this returns an exception when the right value is not entered
        Object newValue = Optional.ofNullable(45)
                .orElseThrow(() -> new IllegalStateException("exception"));

        System.out.println(newValue);

        // checks if a value is present and then runs an operation
        Optional.ofNullable("samuel.afotey@turntabl.io")
                .ifPresentOrElse(email -> System.out.println("Sending email to " + email),
                        () -> System.out.println("Cannot send email"));
    }

}
