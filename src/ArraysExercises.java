import java.util.Arrays;

public class ArraysExercises {
    public static Person[] addPerson(Person[] people, Person person) {
        Person[] newPeople = Arrays.copyOf(people, people.length + 1);
        newPeople[people.length] = person;
        return newPeople;
    }

    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(numbers));
        Person[] people = new Person[3];
        people[0] = new Person("Jasper");
        people[1] = new Person("Laura");
        people[2] = new Person("Cody");
//        for (Person person : people) {
//            System.out.println(person.getName());
//        }
        Person newPerson = new Person("Kenneth");
        people = addPerson(people, newPerson);
        for (Person person : people) {
            System.out.println(person.getName());
        }
    }
}