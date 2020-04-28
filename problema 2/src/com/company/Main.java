package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       // int[] A ={4,5,6,3,2,9};
       // int n = A.length-1;

        int[] a = new int[10];
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i=1;i<=n;i++)
            a[i] = scanner.nextInt();

        System.out.println("Diferenta este: "+diferenta(a,n));
    }

    public static int diferenta(int[] a, int n)
    {
        if(n==0)
            return 0;
        else
            if(n%2==0)
            return diferenta(a,n-1)+a[n];
        else
            return diferenta(a,n-1)-a[n];
    }

}
