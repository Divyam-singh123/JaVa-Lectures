package Task;
class AgeNotValidException extends Exception {
 public AgeNotValidException(String message) {
     super(message);
 }
}

public class Exceptionss {
 static void checkAge(int age) throws AgeNotValidException {
     if (age < 18) {
         throw new AgeNotValidException("Age must be 18 or above to vote.");
     } else {
         System.out.println("You are eligible to vote!");
     }
 }

 public static void main(String[] args) {
     try {
         checkAge(15);
     }catch (AgeNotValidException e) {
         System.out.println("Caught the Exception: " + e.getMessage());
     }

     System.out.println("Program continues...");
 }
}
