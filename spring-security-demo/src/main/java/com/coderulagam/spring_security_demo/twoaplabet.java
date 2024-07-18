package com.coderulagam.spring_security_demo;

public class twoaplabet {
    public static void main(String[] args) {
        String arr[] = {"abc3def4ij1lm6"};
        for(String word : arr) {
            palindrome(word);
        }
    }

    public static void palindrome(String input) {
        input.chars()
                .mapToObj(c -> (char) c)
                .filter(Character::isDigit)
                .forEach(c -> {
                    int index = input.indexOf(c);
                    if (index >= 3 &&
                            Character.isAlphabetic(input.charAt(index - 1)) &&
                            Character.isAlphabetic(input.charAt(index - 2)) &&
                            Character.isDigit(input.charAt(index - 3))) {
                        System.out.print(input.charAt(index - 2));
                        System.out.print(input.charAt(index - 1));
                    }
                });
    }
}
