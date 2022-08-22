package fi.aidaluu.javahackerrank;

import java.util.Scanner;

/**
 * Java Output Formatting
 *
 * @author aidaluu
 */
public class JavaOutputFormatting {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            int x=sc.nextInt();
            System.out.printf("%-14s %03d %n", s1, x);
        }
        System.out.println("================================");

        /* Expected Output:
        ================================
        java           100
        cpp            065
        python         050
        ================================
        */
    }
    
}
