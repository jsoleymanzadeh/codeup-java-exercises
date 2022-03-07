abstract class Animal {
    private int numberOfLegs;
    private String preferredClimate;

    public Animal(int numberOfLegs, String preferredClimate) {
        this.numberOfLegs = numberOfLegs;
        this.preferredClimate = preferredClimate;
    }

    public String getAnimalInfo() {
        return numberOfLegs + " legs\nprefers " + preferredClimate + " environments\n";
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public String getPreferredClimate() {
        return preferredClimate;
    }

    public void setPreferredClimate(String preferredClimate) {
        this.preferredClimate = preferredClimate;
    }
}