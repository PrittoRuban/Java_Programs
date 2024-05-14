import java.util.Scanner;

public class CalculateGPA {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter your grade (A to F):");
            String grade = input.nextLine().toUpperCase();
            try {
                double gpa = calculateGPA(grade);
                System.out.println("Your GPA is: " + gpa);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static double calculateGPA(String grade) {
        switch (grade) {
            case "A" -> {
                return 4.0;
            }
            case "B" -> {
                return 3.0;
            }
            case "C" -> {
                return 2.0;
            }
            case "D" -> {
                return 1.0;
            }
            case "F" -> {
                return 0.0;
            }
            default ->
                throw new IllegalArgumentException("Invalid grade. Please enter a grade from A to F.");
        }
    }
}
