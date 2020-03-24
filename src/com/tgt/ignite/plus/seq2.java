package com.tgt.ignite.plus;

import java.util.Scanner;

public class seq2 {
    public static void main(String[] args){
        int n;
        Scanner read = new Scanner(System.in);
        System.out.println("enter number");
        n = read.nextInt();
        for(int i=1;i<=n;i++){
            System.out.print(i*Math.pow(-1,i) + " ");
        }
    }
}
