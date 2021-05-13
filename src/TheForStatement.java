public class TheForStatement {

    public static boolean isPrime(int n) {

        if(n == 1) {
            return false;
        }

    //  for(int i = 2; i <= (long) Math.sqrt(n); i ++) { <- Loop is faster
        for(int i = 2; i <= n / 2; i ++) { // <- Loop is slower
            System.out.println("Looping " + i);
            if(n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static double calculateInterest(double amount, double interestRate) {
        return(amount * (interestRate/100));
    }


}
