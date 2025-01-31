import java.util.Scanner;
import java.util.stream.IntStream;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = 19;//sc.nextInt();
       // boolean isP = isPrime(number);   // add your method here
        //boolean isP = isPrime1(number);
        boolean isP = isPrimeConventional(number);

        if(isP) System.out.println("The given number :"+number+" is Prime");
        else System.err.println("The given number :"+number+" is not Prime");

        sc.close();
    }

    private static boolean isPrime(int n) {     //Writing the program using filter and findAny
       return n>1 && IntStream.rangeClosed(2, (int) (Math.sqrt(n)))
               .filter(i -> n % i == 0).findAny().isEmpty();
    }

    private static boolean isPrime1(int n) {        // Writng the program using stream method noneMatch
        return n>1 && IntStream.rangeClosed(2,(int) Math.sqrt(n)).noneMatch(i -> n%i ==0);
    }

    private static boolean isPrimeConventional(int number) {
        int x = (int)(Math.sqrt(number));
        //System.out.println(x);
        int count = 0;
        for (int i =2; i <= x ; i++){
            if(number%i == 0){
                count++;
            }
        }
        if(count ==0) return true;
        return false;
    }
}
