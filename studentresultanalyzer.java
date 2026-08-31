import java.util.Scanner;

class StudentResultAnalyzer {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // 1. Ask for the student's name
        System.out.print("Enter student's name: ");
        String name = scanner.nextLine();

        // 2. Ask for marks in 3 subjects
        System.out.print("Enter marks for Subject 1: ");
        double sub1 = scanner.nextDouble();

        System.out.print("Enter marks for Subject 2: ");
        double sub2 = scanner.nextDouble();

        System.out.print("Enter marks for Subject 3: ");
        double sub3 = scanner.nextDouble();

        // 3. Calculate total marks
        double totalMarks = sub1 + sub2 + sub3;

        // 4. Calculate average
        double average = totalMarks / 3;

        // 5. Check whether the student passed (e.g., 40 or above in each subject)
        boolean isPassed = (sub1 >= 40) && (sub2 >= 40) && (sub3 >= 40);

        // 6. Check whether the student got distinction (e.g., average of 75 or above)
        boolean hasDistinction = isPassed && (average >= 75);

        // 7. Check whether the student deserves a special award (e.g., perfect 100 average)
        boolean deservesSpecialAward = isPassed && (average == 100);

        // 8. Display the final result
        System.out.println("\n========= FINAL RESULT =========");
        System.out.println("Student Name: " + name);
        System.out.println("Total Marks : " + totalMarks + " / 300");
        System.out.printf("Average Marks: %.2f%%\n", average);
        
        // Display passing status using if-else
        if (isPassed) {
            System.out.println("Status       : PASSED");
        } else {
            System.out.println("Status       : FAILED");
        }

        // Display additional achievements
        if (hasDistinction) {
            System.out.println("Achievement  : Graduated with DISTINCTION!");
        }
        
        if (deservesSpecialAward) {
            System.out.println("Award        : Congratulations! You received a SPECIAL AWARD for a perfect score!");
        }
        System.out.println("=================================");

        // Close the scanner resource
        scanner.close();
    }
}