public class Cat extends Animal {
    private String unique;
    public Cat() {
        super(4, "all");
        unique = "is popular";
    }

    public String getUnique() {
        return unique;
    }

    public void setUnique(String unique) {
        this.unique = unique;
    }

    @Override
    public String getAnimalInfo() {
        return super.getAnimalInfo() + this.unique;
    }
}