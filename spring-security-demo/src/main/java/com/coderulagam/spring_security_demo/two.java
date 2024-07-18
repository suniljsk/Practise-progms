package com.coderulagam.spring_security_demo;

public class two {
    public static void main(String[] args) {
        String arr[]= {"abc3def4ij1lm6"};
        for(String word:arr) {
            palindrome(word);
            //System.out.println(word);

        }
    }
    public static void palindrome(String input) {
        char c[]=input.toCharArray();
        for(int i=0;i<c.length;i++){
            if(Character.isDigit(c[i])) {
                if(Character.isAlphabetic(c[i-1])&&Character.isAlphabetic(c[i-2])&&Character.isDigit(c[i-3])) {
                    System.out.print(c[i-2]);
                    System.out.print(c[i-1]);
                }
            }
        }
    }
}
