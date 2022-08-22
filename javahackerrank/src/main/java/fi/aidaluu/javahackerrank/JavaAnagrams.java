package fi.aidaluu.javahackerrank;

import java.util.Scanner;

/**
 * Java Anagrams
 *
 * @author aidaluu
 */
public class JavaAnagrams {
    
    private static int countCharOccurrences(String str, char c) {
        int count = 0;
        for(int i = 0; i < str.length(); i++) {    
            if (str.charAt(i) == c) {
                count++;
            }
        }
        return count;
    }

    static boolean isAnagram(String a, String b) {
        boolean charsMatch = false;
        if (a.length() == b.length()) {
            for (int i = 0; i < a.length(); i++) {
                int aOccurrances = countCharOccurrences(a.toLowerCase(), a.charAt(i));
                int bOccurrances = countCharOccurrences(b.toLowerCase(), a.charAt(i));
                if (aOccurrances == bOccurrances) {
                    charsMatch = true;
                } else {
                    charsMatch = false;
                }
            }
        }
        return charsMatch;
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
    
}
