package grades;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Student {
    private String name;
    private ArrayList<Integer> grades;
    private HashMap<String, String> attendance;

    public Student(String studentName) {
        this.name = studentName;
        this.grades = new ArrayList<>();
        this.attendance = new HashMap<>();
    }

    public String getName() {
        return this.name;
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public double getGradeAverage() {
        int total = 0;
        for (Integer grade : grades) {
            total += grade;
        }
        return (double) total / grades.size();
    }

    public void getGrades() {
        for (Integer grade : grades) {
            System.out.printf("%d ", grade);
        }
    }

    public void recordAttendance() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Date: [YYYY-MM-DD] ");
        String date = scanner.next();
        System.out.print("Attendance: [P/A] ");
        String presence = scanner.next();
        while (!presence.equals("P") && !presence.equals("A")) {
            System.out.println("Try again.");
            System.out.print("Attendance: [P/A] ");
            presence = scanner.next();
        }
        attendance.put(date, presence);
    }

    public double attendanceRate() {
        int presentDays = 0;
        int totalDays = 0;
        for (String date : attendance.keySet()) {
            totalDays++;
            if (attendance.get(date).equals("P")) {
                presentDays++;
            }
        }
        return (double) presentDays / totalDays;
    }

    public static void main(String[] args) {
        Student test = new Student("test");
        test.recordAttendance();
        test.recordAttendance();
        System.out.println("attendance = " + test.attendance);
    }
}