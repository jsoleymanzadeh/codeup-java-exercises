package grades;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {
    private static void randomGrades(Student student) {
        for (int i = 0; i < 4; i++) {
            student.addGrade((int) (Math.random() * 100));
        }
    }

    private static void randomAttendance(Student student) {
        ArrayList<String> dates = new ArrayList<>();
        dates.add("2022-02-21");
        dates.add("2022-02-22");
        dates.add("2022-02-23");
        dates.add("2022-02-24");
        dates.add("2022-02-25");
        for (String date : dates) {
            if (Math.random() > 0.5) {
                student.recordAttendance(date, "P");
            } else {
                student.recordAttendance(date, "A");
            }
        }
    }

    private static void displayInfo(Student student, String userInput) {
        System.out.printf("\nName: %s - GitHub Username: %s\nCurrent Average: %.1f\nAll Grades: ", student.getName(), userInput, student.getGradeAverage());
        student.getGrades();
        System.out.printf("\nAttendance Record: %.1f%%", student.attendanceRate());
        System.out.print("\nAbsences: ");
        for (String date : student.findAbsences()) {
            System.out.printf("%s ", date);
        }
    }

    private static void performActions(HashMap<String, Student> students) {
        Scanner scanner = new Scanner(System.in);
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
            System.out.println("\nname,github_username,average,attendance");
            for (String key : students.keySet()) {
                System.out.printf("%s,%s,%.1f,%.1f\n", students.get(key).getName(), key, students.get(key).getGradeAverage(), students.get(key).attendanceRate());
            }
        } else {
            System.out.printf("\nSorry, no student found with the GitHub username of \"%s\"\n", userInput);
        }
        System.out.print("\nWould you like to see another student? [y/N] ");
        if (scanner.next().equals("y")) {
            performActions(students);
        }
    }

    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();
        Student adam = new Student("Adam");
        randomGrades(adam);
        randomAttendance(adam);
        Student bill = new Student("Bill");
        randomGrades(bill);
        randomAttendance(bill);
        Student cassandra = new Student("Cassandra");
        randomGrades(cassandra);
        randomAttendance(cassandra);
        Student dana = new Student("Dana");
        randomGrades(dana);
        randomAttendance(dana);
        students.put("awesomeadam", adam);
        students.put("billthedev", bill);
        students.put("cassiecancode", cassandra);
        students.put("developerdana", dana);
        System.out.print("Welcome!\n\nHere are the GitHub usernames of our students:\n\n");
        for (String key : students.keySet()) {
            System.out.printf("|%s| ", key);
        }
        System.out.println();
        performActions(students);
        System.out.println("\nGoodbye, and have a wonderful day!");
    }
}