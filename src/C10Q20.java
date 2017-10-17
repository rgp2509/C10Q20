//
//(Approximate e) Programming Exercise 5.26 approximates e using the following series
// : e = 1 + 1/1! + 1/2! + 1/3! + 1/4! + c + 1/i!
//
//In order to get better precision, use BigDecimal with 25 digits of precision in the computation.
// Write a program that displays the e value for i = 100, 200, . . ., and 1000.


import java.math.BigDecimal;
import java.math.BigInteger;

public class C10Q20 {
    public static void main(String[] args) {
        System.out.println("Welcome to the e value Approximator, I will calculate e for 25 digits." );
        System.out.println("at 100 factorial " +eVal(100));
        System.out.println("at 200 factorial " +eVal(200));
        System.out.println("at 1000 factorial " +eVal(1000));
    }

    public static BigDecimal eVal (int input){
        BigDecimal eAprox = BigDecimal.ZERO;
        for (Bigdecimal i = BigDecimal.ONE; i.compar)
        eAprox = eAprox.add(BigDecimal.ONE(divide.(fact(input));

        return eAprox;
    }
    public static BigInteger fact (int input){
        // Calculates the Factorial value
        int fVal = 0;
        for (int i=1; i<input; i++){
            fVal = fVal*i;
        }
        return fVal;
    }

}
