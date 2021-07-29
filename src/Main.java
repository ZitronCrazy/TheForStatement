public class Main {

    public static void main(String[] args) {
        System.out.println("10,000 at 2 % interest = " + TheForStatement.calculateInterest(10000.0, 2.0));
        System.out.println("10,000 at 3 % interest = " + TheForStatement.calculateInterest(10000.0, 3.0));
        System.out.println("10,000 at 4 % interest = " + TheForStatement.calculateInterest(10000.0, 4.0));
        System.out.println("10,000 at 5 % interest = " + TheForStatement.calculateInterest(10000.0, 5.0));

        System.out.println("____________");

    //  for(init; termination; increment) {}
        for(int i = 0; i < 5; i ++) {
            System.out.println("Loop " + i + " hello!");
        }

        System.out.println("____________");

        for(int i = 2; i < 9; i ++) {
    //      System.out.println("10,000 at " + i + " % interest = " + TheForStatement.calculateInterest(10000.0, i) + " Stopped");
            System.out.println("10,000 at " + i + " % interest = " + String.format("%.2f", TheForStatement.calculateInterest(10000.0, i)));
        }

        System.out.println("____________");

        for(int i = 8; i >= 2; i --) {
            System.out.println("10,000 at " + i + " % interest = " + String.format("%.2f", TheForStatement.calculateInterest(10000.0, i)));
        }

        int count = 0;
        for(int i = 10; i < 50; i ++) {
            if(TheForStatement.isPrime(i)) {
                count ++;
                System.out.println("Number " + i + " is a prime number");
                if(count == 3) {
                    System.out.println("Exiting for loop");
                    break;
                }
            }
        }
    }
}
