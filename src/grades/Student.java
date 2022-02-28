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

    public void recordAttendance(String date, String value) {
        Scanner scanner = new Scanner(System.in);
        while (!value.equals("P") && !value.equals("A")) {
            System.out.println("Attendance value must be \"P\" or \"A\"");
            System.out.print("Attendance: [P/A] ");
            value = scanner.next();
        }
        this.attendance.put(date, value);
    }

    public double attendanceRate() {
        int presentDays = 0;
        int totalDays = 0;
        for (String date : this.attendance.keySet()) {
            totalDays++;
            if (this.attendance.get(date).equals("P")) {
                presentDays++;
            }
        }
        if (totalDays == 0) {
            return 0;
        }
        return (double) presentDays * 100 / totalDays;
    }

    public ArrayList<String> findAbsences() {
        ArrayList<String> absences = new ArrayList<>();
        for (String date : this.attendance.keySet()) {
            if (this.attendance.get(date).equals("A")) {
                absences.add(date);
            }
        }
        return absences;
    }
}