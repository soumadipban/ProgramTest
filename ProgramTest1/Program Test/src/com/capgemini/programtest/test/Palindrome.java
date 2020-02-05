//A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.(Wikipedia)

package com.capgemini.programtest.test;

import java.util.Scanner;

public class Palindrome {
	
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String str = "";
        
        int len = A.length();

        for(int i = len-1 ; i>=0; i--){
            str = str +  A.charAt(i);
        }

        if(str.equals(A)){
            System.out.print("Yes");
        }
        
    }
}
