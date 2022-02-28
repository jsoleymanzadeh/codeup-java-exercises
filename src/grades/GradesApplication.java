package grades;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {
    private static void randomGrades(Student student) {
        for (int i = 0; i < 4; i++) {
            student.addGrade((int) (Math.random() * 100));
        }
    }

    private static void displayInfo(Student student, String userInput) {
        System.out.printf("\nName: %s - GitHub Username: %s\nCurrent Average: %.1f\nAll Grades: ", student.getName(), userInput, student.getGradeAverage());
        student.getGrades();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Student> students = new HashMap<>();
        Student adam = new Student("Adam");
        randomGrades(adam);
        Student bill = new Student("Bill");
        randomGrades(bill);
        Student cassandra = new Student("Cassandra");
        randomGrades(cassandra);
        Student dana = new Student("Dana");
        randomGrades(dana);
        students.put("awesomeadam", adam);
        students.put("billthedev", bill);
        students.put("cassiecancode", cassandra);
        students.put("developerdana", dana);
        System.out.print("Welcome!\n\nHere are the GitHub usernames of our students:\n\n");
        for (String key : students.keySet()) {
            System.out.printf("|%s| ", key);
        }
        System.out.println();
        String userContinue;
        do {
            System.out.print("\nWhat student would you like to see more information on?\nHINT: enter \"all\" for all students\nHINT: enter \"average\" for the class average\nHINT: enter \"csv\" for a csv report\n\n> ");
            String userInput = scanner.next();
            if (students.containsKey(userInput)) {
                Student currentStudent = students.get(userInput);
                displayInfo(currentStudent, userInput);
                System.out.println();
            } else if (userInput.equals("all")) {
                for (String key : students.keySet()) {
                    displayInfo(students.get(key), key);
                    System.out.println();
                }
            } else if (userInput.equals("average")) {
                double total = 0;
                for (String key : students.keySet()) {
                    total += students.get(key).getGradeAverage();
                }
                System.out.printf("\nClass Average: %.1f\n", total / students.size());
            } else if (userInput.equals("csv")) {
                System.out.println("\nname,github_username,average");
                for (String key : students.keySet()) {
                    System.out.printf("%s,%s,%.1f\n", students.get(key).getName(), key, students.get(key).getGradeAverage());
                }
            } else {
                System.out.printf("\nSorry, no student found with the GitHub username of \"%s\"", userInput);
            }
            System.out.print("\nWould you like to see another student? [y/N] ");
            userContinue = scanner.next();
        } while (userContinue.equals("y"));
        System.out.println("\nGoodbye, and have a wonderful day!");
    }
}