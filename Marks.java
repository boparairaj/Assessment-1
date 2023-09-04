
/**
 * Write a description of class Marks here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;
public class Marks
{
    // instance variables - replace the example below with your own
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the assignment name: ");
        String assignmentName = scanner.nextLine();

        double[] marksList = new double[30];
        int studentCount = 0;

        while (studentCount < 30) {
            System.out.print("Enter mark for student " + (studentCount + 1) + ": ");
            double mark = scanner.nextDouble();

            if (mark >= 0 && mark <= 30) {
                marksList[studentCount] = mark;
                studentCount++;
            } else {
                System.out.println("Invalid input! Enter a mark between 0 and 30.");
            }
        }

        System.out.println("Assignment Name: " + assignmentName);
        for (double mark : marksList) {
            System.out.print(mark + " ");
        }
        System.out.println();
    }
}
