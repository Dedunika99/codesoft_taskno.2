/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gradecal;

import java.util.Scanner;

public class GradeCal {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of subjects");
        int noOfSubjects = input.nextInt();
        int marks[] = new int[noOfSubjects];

        for (int i = 0; i < marks.length; i++) {
            System.out.println("Enter the marks obtained out of 100 for subject " + (i + 1));
            marks[i] = input.nextInt();
            while (marks[i] < 0 || marks[i] > 100) {
                System.out.println("Invalid mark");
                System.out.println("Enter a valid mark for subject " + (i + 1));
                marks[i] = input.nextInt();
            }
        }
        int totalMarks = 0;
        for (int mark : marks) {
            totalMarks += mark;
        }
        float average = (float) totalMarks / noOfSubjects; 
        String grade;
        if (average >= 90) {
            grade = "A";
        } else if (average >= 70) {
            grade = "B";
        } else if (average >= 50) {
            grade = "C";
        } else if (average >= 30) {
            grade = "S";
        } else {
            grade = "F";
        }

        System.out.println("Total marks : " + totalMarks);
        System.out.println("Average : " + average);
        System.out.println("Grade : " + grade);
    }
}


