package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int p=0,i=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti un numar de la tastatura: ");
        int n = scanner.nextInt();
        cifre(n,p,i);

    }

     static void cifre(int n, int p, int i) {

        if (n > 0) {
            int c = n % 10;
            if (c % 2 == 0) {
                p = p * 10 + c;
            } else i = i * 10 + c;

            n = n / 10;
            cifre(n, p, i);
        } else
        System.out.println("Cifre pare: " + reversedNumber(p) + "\n" + "Cifre impare: " + reversedNumber(i));
    }

     static int reversedNumber(int a){
        int k = 0;
        while(a>0){
            k = k*10 + a%10;
            a = a/10;
        }
        return k;
    }
}
