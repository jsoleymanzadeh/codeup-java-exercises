public class Dog extends Animal{
    private String unique;
    public Dog() {
        super(4, "all");
        unique = "plays fetch";
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