
package multiplicationtable;

import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {
        Scanner in=new
        Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.print(i + "X" + j + " = " + i * j + "\t    ");
            }
            System.out.println("");
                
            }
    }
    
}