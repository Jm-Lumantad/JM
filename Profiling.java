package profiling;

import java.util.Scanner;

public class Profiling {

                            int max = 1000;
                            int index = 0;
                            int profilenumber = 1;
                            int deductor = 1000;

                            String[] names = new String[max];
                            String[] email = new String[max];
                            String[] password = new String[max];
                            String[] number = new String[max];
                            String[] age = new String[max];
                            String[] school = new String[max];
                            String[] course = new String[max];
    
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Profiling name;
        name = new Profiling();
        name.Profile();

    }

    public void Profile() {
        Scanner sc = new Scanner(System.in);

        boolean profile = true;
        profile:
        while (profile) {
                            System.out.println("Students Profile");
                            System.out.println("<>");
                            System.out.println("Would You Like To Continue?");
                            System.out.println("1. Continue");
                            System.out.println("2. Exit");
                            int select = sc.nextInt();
                            if (select == 1) {
                                ProfileEnter();
                            } else if (select == 2) {
                                System.exit(0);
            }

        }

    }

    public void ProfileEnter() {
        int profilenum = 1;
        Continue:
        while (true) {
                            System.out.println("<>");
                            System.out.println("Profile" + profilenumber);
                            System.out.print("Name: ");
                            names[index] = sc.next();
                            sc.nextLine();
                            System.out.print("Age: ");
                            age[index] = sc.next();
                            System.out.print("Contact Number: ");
                            number[index] = sc.next();
                            sc.nextLine();  
                            System.out.print("School Enrolled:");
                            school[index] = sc.nextLine();
                            System.out.print("Course Taken:");
                            course[index] = sc.next();
                            System.out.print("Email Address: ");
                            email[index] = sc.next();
                            System.out.print("Password: ");
                            password[index] = sc.next();
                            profilenumber++;
                            index++;
                            deductor--;

            boolean proceed = true;
            next:
            while (proceed) {

                            System.out.println("What do you want to do next?");
                            System.out.println("1. Add another profile.");
                            System.out.println("2. Search profile ");
                            System.out.println("3. View profiles. .");
                            System.out.println("4. Close.");
                            int choice = sc.nextInt();
                            switch (choice) {
                    case 1:
                        continue Continue;                              
                    case 2:
                        System.out.println("Enter name!");
                        sc.nextLine();
                        String namessearch = sc.nextLine();
                        
                        for (int i = 0; i < names.length; i++) {

                            if (namessearch.equals(names[i])) {
                                while (namessearch.equals(names[i])) {
                                    System.out.println("");
                            System.out.println("-Name: " + names[i]);
                            System.out.println("-Age: " + age[i]);
                            System.out.println("-Contact: " + number[i]);
                            System.out.println("-School: " + school[i]);
                            System.out.println("-Course: " + course[i]);
                            System.out.println("-Email: " + email[i]);
                            System.out.println("-Password: " + password[i]);
                                    System.out.println("");
                                    continue next;                             
                                }
                            }
                        }
                        System.out.println("Profile not found");
                        continue next;
                     case 3:
                        for (int j = 0; j < names.length - deductor; j++) {
                            System.out.println("---------------------------------------------------------------------------------------------------------");
                            System.out.println("");
                            System.out.println("|   Profile" + profilenum++ + "   |");
                            System.out.println("");
                            System.out.println("-Name: " + names[j]);
                            System.out.println("-Age: " + age[j]);
                            System.out.println("-Contact: " + number[j]);
                            System.out.println("-School: " + school[j]);
                            System.out.println("-Course: " + course[j]);
                            System.out.println("-Email: " + email[j]);
                            System.out.println("-Password: " + password[j]);
                            System.out.println("");
                        }
                        continue next;                       
                    case 4:
                        System.exit(0);
                }

            }
        }

    }
}
