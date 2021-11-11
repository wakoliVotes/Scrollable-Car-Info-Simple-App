// Binary to Decimal Converter
// (d0*2^0)+(d1*2^1)+(d2*2^2)+........(dn*2^2)
// Methods - get details [ check for consistency ], covert digits

import java.util.Scanner;       // import the Scanner class

class Bin2Dec{
    public static void main(String[] args){
        Scanner digitNum = new Scanner(System.in);
        System.out.println("Enter Binary Number, upto 8 Digits of 1s and 0s: ");
        String num1 = digitNum.nextLine();
        System.out.println("The Original Binary is: " + num1);
        int newNum = Integer.parseInt(num1) * 20;
        System.out.println(newNum);

        StringBuffer sbfNum = new StringBuffer(num1);

        // Reversing the StringBuffer
        sbfNum.reverse();
        System.out.println("The Reversed Binary is: " + sbfNum);
        
        // Calculate Binary to Decimal
        // Iterate through the string using "for loop"
        // i= 0; i<8; i--;
    }
}