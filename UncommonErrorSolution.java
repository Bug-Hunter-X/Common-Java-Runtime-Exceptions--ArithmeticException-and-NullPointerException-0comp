public class UncommonErrorSolution {
    public static void main(String[] args) {
        try {
            int numerator = 10;
            int denominator = 0;
            if (denominator != 0) {
                int result = numerator / denominator; // Check for division by zero
                System.out.println(result);
            } else {
                System.err.println("Cannot divide by zero.");
            }
        } catch (ArithmeticException e) {
            System.err.println("ArithmeticException caught: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.");
        }
        String str = "Hello";
        if (str != null) {
            System.out.println(str.length()); //Check for null before calling method
        } else {
            System.out.println("String is null.");
        }
    }
}