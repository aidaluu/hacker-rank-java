package fi.aidaluu.javahackerrank;

import java.util.Scanner;

/**
 * Java Stdin and Stdout I
 *
 * @author aidaluu
 */
public class JavaStdinAndStdoutI {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        scan.close();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
    
}
