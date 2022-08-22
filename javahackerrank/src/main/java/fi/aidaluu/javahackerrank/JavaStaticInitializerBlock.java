package fi.aidaluu.javahackerrank;

import java.util.Scanner;

/**
 * Java Static Initializer Block
 *
 * @author aidaluu
 */
public class JavaStaticInitializerBlock {
    
    private static final int B;
    private static final int H;
    private static final boolean flag;
    private static Scanner scanner = new Scanner(System.in);
    
    static {
        B = scanner.nextInt();
        H = scanner.nextInt();
        flag = checkFlag();
    }

    private static boolean checkFlag() {
        scanner.close();
        boolean flag = (B > 0 && H > 0 ? true : false);
        if (!flag) {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
        return flag;
    }

    public static void main(String[] args){
        if(flag){
            int area=B*H;
            System.out.print(area);
        }	
    }   
    
}
