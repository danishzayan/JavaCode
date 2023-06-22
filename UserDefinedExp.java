class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}

public class UserDefinedExp {
    public static void main(String[] args) {
        try {
            int age = 15;
            if (age < 18) {
                throw new MyException("You must be at least 18 years old.");
            } else {
                System.out.println("Access granted! You are eligible.");
            }
        } catch (MyException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
