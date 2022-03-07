public class Fish extends Animal{
    private String unique;
    public Fish() {
        super(0, "underwater");
        unique = "has fins";
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