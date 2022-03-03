public class TimeRecord {
    private String startingTime;
    private String endingTime;
    private String breakDeduction;

    public TimeRecord(String startingTIme, String endingTime, String breakDeduction) {
        this.startingTime = startingTIme;
        this.endingTime = endingTime;
        this.breakDeduction = breakDeduction;
    }

    public String getStartingTime() {
        return startingTime;
    }

    public void setStartingTime(String startingTime) {
        this.startingTime = startingTime;
    }

    public String getEndingTime() {
        return endingTime;
    }

    public void setEndingTime(String endingTime) {
        this.endingTime = endingTime;
    }

    public String getBreakDeduction() {
        return breakDeduction;
    }

    public void setBreakDeduction(String breakDeduction) {
        this.breakDeduction = breakDeduction;
    }

    private String normalizeTime(String time) {
        String hoursPlace = time.substring(0, 2);
        String timeRest = time.substring(2);
        if (time.charAt(5) == 'P' && !hoursPlace.equals("12")) {
            hoursPlace = String.valueOf(Integer.parseInt(hoursPlace) + 12);
        } else if (time.charAt(5) == 'A' && hoursPlace.equals("12")) {
            hoursPlace = "00";
        }
        return hoursPlace + timeRest;
    }

    public double calculateHours() {
        double totalTime = 0;
        String startTime = normalizeTime(startingTime);
        String endTime = normalizeTime(endingTime);
        int totalHours = Integer.parseInt(endTime.substring(0, 2)) - Integer.parseInt(startTime.substring(0, 2));
        if (totalHours < 0) {
            totalHours += 24;
        }
        int totalMinutes = Integer.parseInt(endTime.substring(3, 5)) - Integer.parseInt(startTime.substring(3, 5));
        if (totalMinutes < 0) {
            totalMinutes += 60;
            totalHours--;
        }
        totalTime = totalHours + ((double) totalMinutes / 60);
        double totalBreak = Double.parseDouble(breakDeduction.substring(0, 2)) + (Double.parseDouble(breakDeduction.substring(3)) / 60);
        return totalTime - totalBreak;
    }
}