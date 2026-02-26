package _07_Exception;

// Step 1: Create custom exception class
class InvalidAgeException extends Exception {

    InvalidAgeException(String message) {
        super(message);
    }
}

// Main class
public class CustomException {

    static void checkAge(int age) throws InvalidAgeException {

        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above");
        }

        System.out.println("Eligible to vote");
    }

    public static void main(String[] args) {

        try {
            checkAge(16);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}

