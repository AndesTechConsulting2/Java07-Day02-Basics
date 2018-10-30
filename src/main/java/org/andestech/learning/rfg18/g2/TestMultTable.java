package org.andestech.learning.rfg18.g2;

public class TestMultTable {

    public static void main(String[] args)
    {

    int N=13, M=13;
    int j_start = 2, i_start=1, dj=2, di=1;

    System.out.print("\t");
    for (int i=i_start;i<=N; i=i+di) {System.out.print(i+"\t");}
    System.out.println();


    for (int j=j_start;j<=M; j=j+dj) {
        System.out.print(j+"\t");

        for (int i = i_start; i <= N; i=i+di) {
            System.out.print(i*j + "\t");
        }

        System.out.println();
    }







    }

}
