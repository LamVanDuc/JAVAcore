package com.example.Baitap.Baitap1;

import java.util.Scanner;

public class ApplicationBaitap1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        long binarynum = 0;
        int rem, temp = 1;
        System.out.println("Nhap so tu nhien bat ky : ");
        int decimalnum = scanner.nextInt();
        System.out.print("\nhệ cơ số 2n là : ");
        while (decimalnum!=0)
        {
            rem = decimalnum % 2;
            decimalnum = decimalnum / 2;
            binarynum = binarynum + rem * temp;
            temp = temp * 10;

            /*decimal 15 % 2
            rem =1 , decimal = 7
            binary = 0 , temp = 1 , rem = 1 => 0 + 1 *1 ;
            binary = 1;

             temp *10 = 1*10 = 10
            decimal 7 % 2
            rem  = 1 , decimal = 3
            binary = 1 , temp = 10 , rem = 1 => 1 + 1 * 10 ;
            binary = 11
            temp * 10 = 10 * 10 = 100;

            decimal 3 % 2
            rem  = 1 , decimal = 1
            binary = 11 , temp = 100 , rem = 1 => 11 + 1 * 100 ;
            binary = 111
            temp * 10 = 10 * 10 = 1000;


            decimal 1 % 2
            rem  = 1 , decimal = -1
            binary = 111 , temp = 1000 , rem = 1 => 111 + 1 * 1000 ;
            binary = 1111

             */
        }
        System.out.println(binarynum);

    }
}
