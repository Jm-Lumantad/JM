    package Lumantad;

import java.util.Scanner;

public class lumantad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = "a";
        int yourHealth = 100;
        int player2Health = 100;
       System.out.println("Welcome to the sniper war battle ground");
       System.out.println("In this game you have to use snipper and granade to defeat your enemy!");
       System.out.println("You have 100hp");
       System.out.println("Your enemy has 100hp");
       System.out.println("Start!!");
       System.out.println("Enemy spoted!");
       System.out.println("a. shoot");
       System.out.println("b. Run");
       System.out.println();
       System.out.println("Please Choose a or b!!");
        a = sc.next();
        System.out.println();
        System.out.println();
        switch (a){
            case "a":
            case "A":
                System.out.println("player2 hit in the head!!");
                System.out.println("Health decrease 50!");
                player2Health -= 50;
                System.out.println("Enemy's HP now is " + player2Health);
                break;
            case "b":
            case "B":
                System.out.println("You are hit!");
                System.out.println("Health decrease 45!");
                yourHealth -= 45;
                System.out.println("Your Health now is: " + yourHealth);
                break;
            default:
                System.out.println("Choose only a and b!!");
    }
    
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Enemy just throw a granade!!");
        System.out.println("Be Careful!!");
        System.out.println("What is your next move?");
        System.out.println("a. Tty to move away!!");
        System.out.println("b. Try to throw it back");
            a = sc.next();
            System.out.println();
            System.out.println();
            switch (a){
                case "a":
                case "A":
                    System.out.println("The Granade just explode!");
                    System.out.println("You are hit health decrease 27.5!!");
                    yourHealth -= 27.5;
                    System.out.println("Your Health now is: " + yourHealth);
                    break;
                case "b":
                case "B": 
                    System.out.println("You're safe now!!");
                    System.out.println("You have the chance to hit him!!");
                break;
             default:
            System.out.println("Choose only a and b!!");
    }
        System.out.println();
        System.out.println();
        System.out.println("Enemy is Reloading and he is behind you!!");
        System.out.println("What is your next move?");
        System.out.println("a. Run!");
        System.out.println("b. Throw a granade!");
            a = sc.next();
            System.out.println();
            System.out.println();
            switch (a){
                case "a":
                case "A":
                    System.out.println("HeadShot!!!");
                    System.out.println("You are to Slow to think!!");
                    System.out.println("The Enemy Just Shot you!");
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    yourHealth -=27.5;
                    System.out.println("Your Health now is: " + yourHealth);
                    System.out.println("Game Over!!!");
            break;
                case "b":
                case "B":
                    System.out.println();
                    System.out.println();
                    System.out.println("You kill the enemy!!");
                    System.out.println("Enemy is Dead!");
                    player2Health -= 50;
                    System.out.println("Enemy's HP now is " + player2Health);
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println("VICTORY!");
                    break;
                default:
                     System.out.println("Please type a or b only");
                    break;
                 } 
            }
    
    }
