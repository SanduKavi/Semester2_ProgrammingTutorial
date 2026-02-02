// Create a class called Calculator
class Calculator {

    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to multiply two integers
    public int multiply(int a, int b) {
        return a * b;
    }

    // Method to square a number
    public int square(int a) {
        return a * a;
    }
}

// Main class to use Calculator
public class Question05_Calculator {
    public static void main(String[] args) {

        // Create an object of Calculator
        Calculator calc = new Calculator();

        // 1. Calculate (3 * 4 + 5 * 7)^2
        int part1 = calc.multiply(3, 4);      // 3*4
        int part2 = calc.multiply(5, 7);      // 5*7
        int sum1 = calc.add(part1, part2);    // 3*4 + 5*7
        int result1 = calc.square(sum1);      // (3*4 + 5*7)^2

        System.out.println("Result of (3*4 + 5*7)^2: " + result1);

        // 2. Calculate (4 + 7)^2 + (8 + 3)^2
        int sum2 = calc.add(4, 7);            // 4+7
        int sum3 = calc.add(8, 3);            // 8+3
        int square2 = calc.square(sum2);      // (4+7)^2
        int square3 = calc.square(sum3);      // (8+3)^2
        int result2 = calc.add(square2, square3); // (4+7)^2 + (8+3)^2

        System.out.println("Result of (4+7)^2 + (8+3)^2: " + result2);
    }
}
