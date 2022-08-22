/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fi.aidaluu.javahackerrank;

import java.util.Scanner;

/**
 * Java String Reverse
 *
 * @author aidaluu
 */
public class JavaStringReverse {
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        sc.close();
        
        boolean isPalindrome = false;
        for (int i = 0; i < A.length(); i++) {
            if (A.substring(i, i+1).equals(A.substring(A.length()-i-1, A.length()-i))) {
                isPalindrome = true;
            } else {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
    }
    
}
