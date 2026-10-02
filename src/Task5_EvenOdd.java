public class Task5_EvenOdd {

    public static String checkEvenOdd(int number) {
        if (number % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

    public static void main(String[] args) {
        int testNumber = 7;


        String result = checkEvenOdd(testNumber);
        System.out.println("The number " + testNumber + " is " + result + ".");

        System.out.println("\n--- Bonus Section ---");


        for (int i = 1; i <= 10; i++) {
            String loopResult = checkEvenOdd(i);
            System.out.println("Number " + i + " is " + loopResult);
        }
    }
}
