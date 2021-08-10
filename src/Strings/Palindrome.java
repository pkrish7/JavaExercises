package Strings;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int wordLength = A.length();
        int flag = 0;
            for (int i=0; i<wordLength; i++){
               flag = (A.charAt(i) == A.charAt(wordLength-1-i)) ? 0 : 1;
            }
            System.out.println(flag);
            System.out.println(flag>0 ? "No" : "Yes");
        }
    }
