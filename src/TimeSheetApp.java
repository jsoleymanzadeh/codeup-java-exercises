import util.Input;

import java.util.HashMap;

public class TimeSheetApp {
    public static void displayTimesheet(HashMap<String, TimeRecord> timesheet) {
        double totalHours = 0;
        for (String day : timesheet.keySet()) {
            System.out.printf("%s:\n\tStart: %s\tEnd: %s\tBreaks: %s\n\tTotal: %.1f\n", day, timesheet.get(day).getStartingTime(), timesheet.get(day).getEndingTime(), timesheet.get(day).getBreakDeduction(), timesheet.get(day).calculateHours());
            totalHours += timesheet.get(day).calculateHours();
        }
        System.out.printf("Total time worked this week: %.1f\n", totalHours);
    }
    public static void editTimesheet(HashMap<String, TimeRecord> timesheet) {
        Input userInput = new Input();
        displayTimesheet(timesheet);
        if(userInput.yesNo("Edit timesheet? [y/N] ")) {
            System.out.print("Day to edit: ");
            String editDay = userInput.getString();
            System.out.printf("Enter %s starting time: hh:mm[AM/PM] ", editDay);
            String startingTime = userInput.getString();
            while(startingTime.length() != 7) {
                System.out.printf("Try again.\nEnter %s starting time: hh:mm[AM/PM] ", editDay);
                startingTime = userInput.getString();
            }
            timesheet.get(editDay).setStartingTime(startingTime);
            System.out.printf("Enter %s ending time: hh:mm[AM/PM] ", editDay);
            String endingTime = userInput.getString();
            while(endingTime.length() != 7) {
                System.out.printf("Try again.\nEnter %s ending time: hh:mm[AM/PM] ", editDay);
                endingTime = userInput.getString();
            }
            timesheet.get(editDay).setEndingTime(endingTime);
            System.out.printf("Enter %s break duration: hh:mm ", editDay);
            String breakDeduction = userInput.getString();
            while(breakDeduction.length() != 5) {
                System.out.printf("Try again.\nEnter %s break duration: hh:mm ", editDay);
                breakDeduction = userInput.getString();
            }
            timesheet.get(editDay).setBreakDeduction(breakDeduction);
            editTimesheet(timesheet);
        } else {
            System.out.println("Exiting...");
        }
    }
    public static void main(String[] args) {
        Input userInput = new Input();
        HashMap<String, TimeRecord> timesheet = new HashMap<>();
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        for(String day : days) {
            System.out.printf("Enter %s starting time: hh:mm[AM/PM] ", day);
            String startingTime = userInput.getString();
            while(startingTime.length() != 7) {
                System.out.printf("Try again.\nEnter %s starting time: hh:mm[AM/PM] ", day);
                startingTime = userInput.getString();
            }
            System.out.printf("Enter %s ending time: hh:mm[AM/PM] ", day);
            String endingTime = userInput.getString();
            while(endingTime.length() != 7) {
                System.out.printf("Try again.\nEnter %s ending time: hh:mm[AM/PM] ", day);
                endingTime = userInput.getString();
            }
            System.out.printf("Enter %s break duration: hh:mm ", day);
            String breakDeduction = userInput.getString();
            while(breakDeduction.length() != 5) {
                System.out.printf("Try again.\nEnter %s break duration: hh:mm ", day);
                breakDeduction = userInput.getString();
            }
            TimeRecord dayRecord = new TimeRecord(startingTime, endingTime, breakDeduction);
            timesheet.put(day, dayRecord);
        }
        editTimesheet(timesheet);
    }
}