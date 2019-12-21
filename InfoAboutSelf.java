
 
import java.util.Scanner;

class Scratch {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       System.out.println("What is your name?");
       String wordInput = sc.nextLine();
       System.out.println("how old are you?");
       int age = sc.nextInt();
       sc.nextLine();
       System.out.println("Where do you live?");
       String address = sc.nextLine();
       sc.nextLine();
       System.out.println("What is your home street number");
       int number= sc.nextInt();
       sc.nextLine();
       System.out.println("What is Your Talent");
       String talent = sc.nextLine();
       sc.nextLine();
       System.out.println("school you're inrolled");
       String school = sc.nextLine();
       
       System.out.println("name:" + wordInput);
       System.out.println("age:" + age);
       System.out.println("Address:" +address);
       System.out.println("number:" + number);
       System.out.println("Talent:" +talent);
       System.out.println("school:" + school);
       
       
   }
}
         