package com.app.com;

import java.util.Arrays;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Anagrams {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
        System.out.print("Enter first String : ");
     String str1=sc.nextLine().toLowerCase();
        System.out.print("Enter second string : ");
        String str2=sc.nextLine().toLowerCase();
        char[] arr1=str1.toCharArray();
        char[] arr2=str2.toCharArray();
       Arrays.sort(arr1);       Arrays.sort(arr2);
       if(Arrays.equals(arr1,arr2))
       {
           System.out.println("Anagram true");
       }
       else System.out.println("Anagram False");


    }
}