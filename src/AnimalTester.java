public class AnimalTester {
    public static void displayAnimalDetails(Animal a) {
        System.out.println(a.getAnimalInfo());
    }

    public static void main(String[] args) {
        Animal dog = new Dog();
        displayAnimalDetails(dog);
        Animal fish = new Fish();
        displayAnimalDetails(fish);
        Animal cat = new Cat();
        displayAnimalDetails(cat);
    }
}