import java.util.Scanner;

public class NewClass1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            count++;
            for (int j = 0; j < n; j++) {
                if (i <= j){
                System.out.print(" * ");
            } else {
                  System.out.print("   ");
             }
            
        }
        System.out.println();
    }
        
    }
    
}

