package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class SearchElementsInArrayListExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Alice");
        names.add("Bob");
        names.add("Steve");
        names.add("John");
        names.add("Steve");
        names.add("Maria");

        //Check if an ArrayList contains a given element
        System.out.println("Does names array contain \"Bob\"? :"+names.contains("Bob"));
        // Find the index of the first occurence of an element in ArrayList
        System.out.println("index of \"Steve\": "+names.indexOf("Steve"));
        System.out.println("index of \"Mark\": "+names.indexOf("Mark"));
        //Find the index of the last occurrence of an element in an ArrayList
        System.out.println("lastIndexof \"Jonh\": "+names.lastIndexOf("John"));
        System.out.println("lastIndexof \"Bill\": "+names.lastIndexOf("Bill"));
    }
}
