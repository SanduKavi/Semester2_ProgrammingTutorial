public class Question04_PatternPrint {
    public static void main(String[] args) {

        // Using while loop (square)
        int rows = 5;
        int i = 0;

        while (i < rows) {
            int j = 0;
            while (j < rows) {
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        }

        System.out.println(); // blank line between figures

        // Using for loop (pyramid)
        for (i = 1; i <= rows; i++) {

            // print spaces
            for (int s = 1; s <= rows - i; s++) {
                System.out.print("  ");
            }

            // print stars
            for (int k = 1; k <= i; k++) {
                System.out.print("*   ");
            }

            System.out.println();
        }
    }
}
