package fi.aidaluu.javahackerrank;

import java.util.Scanner;

/**
 * Java Strings Introduction
 *
 * @author aidaluu
 */
public class JavaStringsIntroduction {
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        // sum the lengths
        System.out.println(A.length() + B.length());
        // alphabetically/lexicographically A precedes B
        System.out.println(A.compareTo(B) <= 0 ? "No" : "Yes");
        // capitalize first letters
        System.out.println(
            A.substring(0, 1).toUpperCase() + A.substring(1) + " " +
            B.substring(0, 1).toUpperCase() + B.substring(1));
    }
    
}
