import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of subjects:");
        int numSubjects = sc.nextInt();

        int[] marks = new int[numSubjects];

        for (int i = 0; i < numSubjects; i++) {
            System.out.println("Enter marks for subject " + (i + 1) + ":");
            marks[i] = sc.nextInt();
        }

        int totalMarks = calculateTotalMarks(marks);
        double averagePercentage = calculateAveragePercentage(totalMarks, numSubjects);
        String grade = calculateGrade(averagePercentage);

        displayResults(totalMarks, averagePercentage, grade);
    }

    public static int calculateTotalMarks(int[] marks) {
        int totalMarks = 0;
        for (int mark : marks) {
            totalMarks += mark;
        }
        return totalMarks;
    }

    public static double calculateAveragePercentage(int totalMarks, int numSubjects) {
        return (double) totalMarks / numSubjects;
    }

    public static String calculateGrade(double averagePercentage) {
        if (averagePercentage >= 90) {
            return "A";
        } else if (averagePercentage >= 80) {
            return "B";
        } else if (averagePercentage >= 70) {
            return "C";
        } else if (averagePercentage >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    public static void displayResults(int totalMarks, double averagePercentage, String grade) {
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage);
        System.out.println("Grade: " + grade);
    }
}
