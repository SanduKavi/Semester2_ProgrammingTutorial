// Class to check even or odd numbers
public class Question03_EvenOddNumber {

    // Method to check if a number is even
    public boolean findEvenOrOdd(int i) {
        return i % 2 == 0; // true if even, false if odd
    }

    public static void main(String[] args) {
        Question03_EvenOddNumber check = new Question03_EvenOddNumber();

        int[] numbers = {10, 23, 56, 77, 90};

        for (int num : numbers) {
            if (check.findEvenOrOdd(num)) {
                System.out.println(num + " is an Even number");
            } else {
                System.out.println(num + " is an Odd number");
            }
        }
    }
}
