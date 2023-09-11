    
    /**
     * Write a description of class Marks here.
     *
     * @author Rajwant Kaur
     * @version (04-09-2023)
     */
    
    import java.util.Scanner;

public class Marks {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompting user to enter the assignment name
        System.out.print("Enter the assignment name: ");
        String assignmentName = scanner.nextLine();

        // Initialize an array to store marks for 30 students
        double[] marksList = new double[30];
        int studentCount = 0;

        // Loop to enter marks for each student
        while (studentCount < 30) {
            System.out.print("Enter mark for student " + (studentCount + 1) + ": ");
            double mark = scanner.nextDouble();

            // Check for valid mark input
            if (mark >= 0 && mark <= 30) {
                marksList[studentCount] = mark;
                studentCount++;
            } else {
                System.out.println("Invalid input! Enter a mark between 0 and 30.");
            }
        }

        // Displaying the assignment name and all the entered marks
        System.out.println("Assignment Name: " + assignmentName);
        for (double mark : marksList) {
            System.out.print(mark + " ");
        }
        System.out.println();

        // Initializing variables to determine the highest and lowest marks
        double highestMark = -1;
        double lowestMark = 31;

        // Loop to determine the highest and lowest marks
        for (double mark : marksList) {
            if (mark > highestMark) {
                highestMark = mark;
            }
            if (mark < lowestMark) {
                lowestMark = mark;
            }
        }

        // Displaying the highest and lowest marks
        System.out.println("Highest Mark: " + highestMark);
        System.out.println("Lowest Mark: " + lowestMark);

        // Calculate mean and standard deviation
        double total = 0;
        double varianceSum = 0;

        // Loop to determine the total of all marks
        for (double mark : marksList) {
            total += mark;
        }

        // Computing mean
        double mean = total / marksList.length;

        // Loop to compute the variance sum
        for (double mark : marksList) {
            varianceSum += (mark - mean) * (mark - mean);
        }

        // Calculating variance
        double variance = varianceSum / marksList.length;

        // Compute the standard deviation using the Babylonian method (square root computation)
        double precision = 0.00001;
        double approximation = variance;
        double previous;

        do {
            previous = approximation;
            approximation = 0.5 * (approximation + variance / approximation);
        } while (Math.abs(approximation - previous) > precision);

        double standardDeviation = approximation;

        // Displaying variance, mean, and standard deviation
        System.out.println("Variance:" + variance);
        System.out.println("Mean: " + mean);
        System.out.println("Standard Deviation: " + standardDeviation);
    }
}
