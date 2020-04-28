package com.company;

public class Main {
   static int[] x = new int[100];
    static int n=8,nrsol;

    public static void main(String[] args) {
        nrsol=0;
        back(1);
        System.out.println("\n"+nrsol+" solutii");

    }

    static void scriesol ()
    { int i,j;
        nrsol++;
        System.out.print("\n\nSolutia a "+nrsol+" este\n");
        for(i=1;i<=n;i++)
        {
            System.out.println();
            for(j=1;j<=n;j++)
                if (x[j]==i) System.out.print("X ");
                else System.out.print("O ");
        }
    }


   static int potcont(int k)
    { int  i;
        for(i=1;i<=k-1;i++)
            if (x[i]==x[k] || k-i==Math.abs(x[k]-x[i])) return 0;
        return 1;
    }

    static void back(int k)
    {
        int i;
        for(i=1;i<=n;i++)
        {
            x[k]=i;
            if (potcont(k)==1)
                if (k==n) scriesol();
                else back(k+1);
        }
    }
}
