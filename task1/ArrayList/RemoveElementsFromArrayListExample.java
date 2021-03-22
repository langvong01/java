package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class RemoveElementsFromArrayListExample {
    public static void main(String[] args) {
        List<String> programingLanguages = new ArrayList<>();
        programingLanguages.add("C");
        programingLanguages.add("C++");
        programingLanguages.add("Java");
        programingLanguages.add("Kotlin");
        programingLanguages.add("Python");
        programingLanguages.add("Per1");
        programingLanguages.add("Ruby");
        System.out.println("Initial List : " + programingLanguages);

        //Remove the element at index 5
        programingLanguages.remove(5);
        System.out.println("After remove(5): "+ programingLanguages);

        boolean isRemoved = programingLanguages.remove("Kotlin\\");
        System.out.println("After remove(5) :"+ programingLanguages);

        //Remove all the elements that exist in a given collection
        List<String> scriptingLanguages = new ArrayList<>();
        scriptingLanguages.add("Python");
        scriptingLanguages.add("Ruby");
        scriptingLanguages.add("Per1");

        programingLanguages.removeAll(scriptingLanguages);
        System.out.println("After removeAll(scriptingLanguages :" + programingLanguages);
        programingLanguages.removeIf(n -> (n.charAt(0) == 'T'));
        /*
        The above removeif() call can also be wrtiten using lambda expression like this
        -programingLanguages.removeif(s -> s.startsWith("C"))
         */
        System.out.println("After  Removing all elements that start with \"C\": "+ programingLanguages);

        //Remove all elemments from the ArrayList
        programingLanguages.clear();
        System.out.println("After clear(): "+ programingLanguages);
    }
}
