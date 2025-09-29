package org.example;

public class SumOfNumbers {

    public static void main(String[] args) {

        int n1  = 10;
        int n2 = 30;
        int result = sumOfNumbers(n1,n2);
        System.out.println("The sum of multiples of 7 between " + n1 + " and " + n2 + " is: " + result);

    }

    static int sumOfNumbers(int n1, int n2){
        if (n1 > n2) {
            return 0;
        }

        if (n1 % 7 == 0) {
            return n1 + sumOfNumbers(n1 + 1, n2);

        }else{
            return sumOfNumbers(n1 + 1,n2);
        }
    }
}
