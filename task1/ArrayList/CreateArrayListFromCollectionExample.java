package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class CreateArrayListFromCollectionExample {
    public static void main(String[] args) {
        List <Integer> firstFivePrimeNumbers = new ArrayList<>();
        firstFivePrimeNumbers.add(2);
        firstFivePrimeNumbers.add(3);
        firstFivePrimeNumbers.add(5);
        firstFivePrimeNumbers.add(7);
        firstFivePrimeNumbers.add(11);

        //Createing an ArrayList from another collection
        List<Integer> firstTenPrimeNumbers = new ArrayList<>(firstFivePrimeNumbers);

        List<Integer> nextFivePrimeNumer = new ArrayList<>();
        nextFivePrimeNumer.add(13);
        nextFivePrimeNumer.add(17);
        nextFivePrimeNumer.add(19);
        nextFivePrimeNumer.add(23);
        nextFivePrimeNumer.add(29);
        //Adding an entire collection to an ArrayList
        firstTenPrimeNumbers.addAll(nextFivePrimeNumer);
        System.out.println(firstTenPrimeNumbers);

    }
}
