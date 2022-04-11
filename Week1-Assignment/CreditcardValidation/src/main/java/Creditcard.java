import java.util.HashSet;
import java.util.Set;

public class Creditcard {

    // fields
    private static int prefix;
    private static long number;
    private static Set<Integer> set = new HashSet<>();

    // Constructor

    public Creditcard(long number, Set<Integer> set) {
        this.number = number;
        this.set = set;
    }


    // Methods
    /** Return true if the card number is valid */
    public static boolean isValid(long number){
        int sum1 = sumOfDoubleEvenPlace(number);
        int sum2 = sumOfOddPlace(number);
        int sum = sum1 + sum2;


        if(sum % 10 == 0){
            return true;
        }else{
            return false;
        }
    }

    /** Get the result from Step b */
    public static int sumOfDoubleEvenPlace(long number){
        int sum = 0;
        int digit = 0;
        int re1 = 0;
        int re2 =0;
        while(number /10 != 0){
            re1 = (int)(number % 100);
            re2 = re1 / 10;
            number = number / 100;
            digit = re2 * 2;
            digit = getDigit(digit);
            sum += digit;
        }
        return sum;

    }


    /** Return this number if it is a single digit, otherwise, return the sum of the two digits */
    public static int getDigit(int number){

        return number/10 + number %10;
    }


    /** Return sum of odd-place digits in number */
    public static int sumOfOddPlace(long number){
        int sum = 0;
        int re1 = 0;
        while(number /10 != 0){
            re1 = (int)(number % 10);
            number = number / 100;
            sum+= re1;
        }
        return sum;
    }

    /** Return true if the digit d is a prefix for number */
    public static boolean prefixMatched(long number, int d){
        int prefix = 0;
        while(number != 0){
            number /= 10;
            prefix = (int)(number% 10);
        }
        if(d == prefix){
            return true;
        }else{
            return false;
        }
    }


    /** Return the number of digits in d */
    public static int getSize(long d){
        int size = 0;
        while(d != 0){
            d /= 10;
            size++;
        }
        return size;
    }

    /** Return the first k number of digits from number. If the number of digits in number is less than k, return number. */
    public static long getPrefix(long number, int k){
        int size = getSize(number);
        if(size < k){
            return number;
        }else{
            while(size - k != 0){
                number/= 10;
            }
        }
        return number;
    }

    public static void main(String[] args){
        long card1 = 4388576018410707L;
        long card2 = 4388576018402626L;
        if(isValid(card1) ){
            System.out.println("card1 is valid");
        }else{
            System.out.println("card1 is not invalid");
        }
        if(isValid(card2)){
            System.out.println("card2 is valid");
        }else{
            System.out.println("card2 is not invalid");
        }
    }

}
