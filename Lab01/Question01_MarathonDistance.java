public class Question01_MarathonDistance {
    public static void main(String[] args) {
        int miles = 26;
        int yards = 385;
        double kilometers;

        kilometers = (miles + yards / 1760.0) * 1.609;

        System.out.println("Distance in kilometers: " + kilometers);
    }
}
