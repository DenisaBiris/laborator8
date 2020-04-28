package com.company;

import java.util.Scanner;

public class Main {
      static  int[] array = new int[100];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dati numarul: \n");
            int n = scanner.nextInt();
            back(1, n);



    }
   static void afisare(int n)
    {
        for (int i = 1; i < n; i++)
           System.out.print(array[i] + "+");
        System.out.print(array[n]);
        System.out.println();    }


   static void back(int i, int sum)
    {
        int j;
        for (j = 1; j <= sum; j++)
        {
            array[i] = j;
            if (array[i] == sum)
                afisare(i);
            else back(i + 1, sum - array[i]);
        }
    }

}
