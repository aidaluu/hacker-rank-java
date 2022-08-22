package fi.aidaluu.javahackerrank;

import java.util.Scanner;

/**
 * Java End-of-file
 *
 * @author aidaluu
 */
public class JavaEndOfFile {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lineNumber = 0;
        while (scanner.hasNext()) {
            lineNumber++;
            System.out.println(lineNumber + " " + scanner.nextLine());
        }
    }
    
}
