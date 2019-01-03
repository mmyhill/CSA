import java.util.Scanner;

/*
* DormRoom4Driver
* Purpose: The goal of DormRoom4Driver is to learn how to incorporate two classes together.
* Author/s: Morgan Myhill
* 12/10/17
* On My Honor: MM
* Collaborators: None
*/
public class DormRoom4Driver {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Input room width: ");
        double width = s.nextDouble();
        System.out.println("Input room length: ");
        double length = s.nextDouble();
        s.nextLine();//to clear before taking in string
        System.out.println("Input room name: ");
        String name = s.nextLine();
        DormRoom4 d = new DormRoom4(width, length, name);
        System.out.println("Select an \n Option:  \n -------------------------- \n 1. Add Student to Room  \n 2. Switch Student in Room  \n " +
                "3. Remove Student from Room  \n 4. Is Student in Room  \n 5. Print Students in Room  \n 6. Quit");
        int choice = s.nextInt();
        s.nextLine();//clear system
        while (choice != 6) {
            switch (choice) {
                case 1: {
                    System.out.println("Input student first name: ");
                    String first = s.nextLine();
                    System.out.println("Input student last name: ");
                    String last = s.nextLine();
                    System.out.println("Input student's SSN: ");
                    String SSN = s.nextLine();
                    System.out.println("Input student Gender: ");
                    char gender = s.nextLine().charAt(0);
                    Student st = new Student(first, last, gender, SSN);
                    d.assignNewStudent(st);
                }
                break;
                case 2: {
                    System.out.println("Input student 1 first name:(student 1 is the student being taken out of their room,  " +
                            "student 2 is the one being moved in. ) ");
                    String first = s.nextLine();
                    System.out.println("Input student 1 last name: ");
                    String last = s.nextLine();
                    System.out.println("Input student 1's SSN: ");
                    String SSN = s.nextLine();
                    System.out.println("Input student 1 Gender: ");
                    char gender = s.nextLine().charAt(0);
                    Student st1 = new Student(first, last, gender, SSN);

                    System.out.println("Input student 2 first name: ");
                    String first2 = s.nextLine();
                    System.out.println("Input student 2 last name: ");
                    String last2 = s.nextLine();
                    System.out.println("Input student 2's SSN: ");
                    String SSN2 = s.nextLine();
                    System.out.println("Input student 2 Gender: ");
                    char gender2 = s.nextLine().charAt(0);
                    Student st2 = new Student(first2, last2, gender2, SSN2);

                    d.switchStudent(st1, st2);
                }
                break;
                case 3: {
                    System.out.println("Input student first name: ");
                    String first = s.nextLine();
                    System.out.println("Input student last name: ");
                    String last = s.nextLine();
                    System.out.println("Input student's SSN: ");
                    String SSN = s.nextLine();
                    System.out.println("Input student Gender: ");
                    char gender = s.nextLine().charAt(0);
                    Student st = new Student(first, last, gender, SSN);
                    d.removeStudent(st);
                }
                break;
                case 4: {
                    System.out.println("Input student first name: ");
                    String first = s.nextLine();
                    System.out.println("Input student last name: ");
                    String last = s.nextLine();
                    System.out.println("Input student's SSN: ");
                    String SSN = s.nextLine();
                    System.out.println("Input student Gender: ");
                    char gender = s.nextLine().charAt(0);
                    Student st = new Student(first, last, gender, SSN);
                    d.isStudent(st);
                }
                break;
                case 5:
                    d.printStudents();
                    break;
            }
            System.out.println("Select an \n Option:  \n -------------------------- \n 1. Add Student to Room  \n 2. Switch Student in Room  \n " +
                    "3. Remove Student from Room  \n 4. Is Student in Room  \n 5. Print Students in Room  \n 6. Quit");
            choice = s.nextInt();
            s.nextLine();//clear system
            }
        }

    }

