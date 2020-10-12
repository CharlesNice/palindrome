package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // Only print out the strings which are palindromes
	    String[] palindromes = {"Kayak", "bob", "tea", "dad", "", null};
        Arrays.stream(palindromes).filter( s -> null!=s && isPalindrome(s.toLowerCase()) )
                                    .forEach(s -> System.out.println(s));
    }

    public static boolean isPalindrome(String s){
        if(s.equals(reversed(s))){
            return true;
        }
        return false;
    }

    public static String reversed(String input){
        if(input.isEmpty()){
            return input;
        }else{
            char[] chars = input.toCharArray();
            StringBuilder stringBuilder = new StringBuilder();
            for(int i = (input.length()-1); i>=0; i--){
                stringBuilder.append(chars[i]);
            }
            return stringBuilder.toString();
        }
    }
}