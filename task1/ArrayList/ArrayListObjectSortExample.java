package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrayListObjectSortExample {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Sara",26));
        people.add(new Person("Cara",27));
        people.add(new Person("Rara",28));
        people.add(new Person("Dara",29));
        System.out.println("Person List: "+ people);
        // Sort people by their age
        people.sort((person1,person2) -> {
            return  person1.getAge() - person2.getAge();
        });
        System.out.println("Sorted Person List by Age" + people);
        people.sort(Comparator.comparingInt(Person::getAge));
        System.out.println("Sorted Person List by Age" + people);

        // You can also sort using Collection.sort() method by passing the custom Comparator
        Collections.sort(people,Comparator.comparing(Person::getName));
        System.out.println("Sorted Person List by Name"+ people);

    }
}
