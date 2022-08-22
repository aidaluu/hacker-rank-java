package fi.aidaluu.javahackerrank;

import java.util.Scanner;

/**
 * Java Substring Comparisons
 *
 * @author aidaluu
 */
public class JavaSubstringComparisons {
    
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        for (int i = 0; i < s.length()-k+1; i++) {
            String sub = s.substring(i, i+k);
            if (i == 0) {
                smallest = sub;
                largest = sub;
            } else {
                if (largest.compareTo(sub) < 0) {
                    largest = sub;
                }
                if (smallest.compareTo(sub) > 0) {
                    smallest = sub;
                }
            }
        }
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
    
}
