/*
To the already defined Student class, add the following methods:
    i. extractInitials(): A method that extracts the initials from the student's name. 
        For example, if the student's name is "John Doe", this method would return "JD".
    ii. removeWhitespace(): A method that removes any whitespace characters from the student's name. 
        For example, if the student's name is "John Doe", this method would transform it to "JohnDoe".
    iii. List all the student names containing a particular substring.
    iv. Sort the students alphabetically
In a separate class that contains main(), read the students details from console input. After displaying the details of all the students, illustrate the use of the above methods.
 */

import java.util.Scanner;

class Student {
    String name;
    int age;
    float cgpa;

    public Student(String name, int age, float cgpa) {
        this.name = name;
        this.age = age;
        this.cgpa = cgpa;
    }

    public String extractInitials() {
        String[] words = name.split(" ");
        String initials = "";
        for (String w : words) {
            initials += w.charAt(0);
        }
        return initials;
    }

    public String removeWhitespace() {
        return name.replace(" ", "");
    }

    public void display() {
        System.out.println("\nName: " + name + "\nAge: " + age + "\nCGPA: " + cgpa);
    }
}

public class Q3_studentArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Name of student " + (i + 1) + ": ");
            String name = sc.nextLine();
            System.out.print("Age of student " + (i + 1) + ": ");
            int age = sc.nextInt();
            System.out.print("CGPA of student " + (i + 1) + ": ");
            float cgpa = sc.nextFloat();
            sc.nextLine();

            students[i] = new Student(name, age, cgpa);
        }


        System.out.println("Details of the students:");
        for (Student student : students) {
            student.display();
        }

        System.out.println("\nExtracted initials: ");
        for (Student student : students) {
            System.out.println(student.extractInitials());
        }

        System.out.println("\nNames without whitespace: ");
        for (Student student : students) {
            System.out.println(student.removeWhitespace());
        }
        sc.close();
    }
}