package set_map;

import array_arraylist.Car;
import array_arraylist.MyArrayList;

import java.util.*;

public class Set_Demo {

    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<>(List.of(10,20,30,30,30,40,20,10));
        System.out.println("integerList = " + integerList);

        Set<Integer> integerSet = new HashSet<>(integerList);
        System.out.println("integerSet = " + integerSet); // Siralama rastgele olur...

        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(10);
        set.add(10);
        set.add(20);
        System.out.println(set);

        // Set of Object
        Set<Car> carSet = new HashSet<>();

        carSet.add(new Car("Honda", 2020));
        carSet.add(new Car("Honda", 2020));
        carSet.add(new Car("BMW", 2022));
        carSet.add(new Car("Peugeout", 2020));

        for (Car car : carSet){
            System.out.println("Print each car "+ car);
        }

        for (int i = 0; i < carSet.size(); i++) {
//            System.out.println(carSet);
        }

        // Sort a set
        Set<Integer> unsortedSet = new HashSet<Integer>(integerList);
        List<Integer> sortedSet = new ArrayList<>(unsortedSet);
        Collections.sort(sortedSet);

        // Declaring object of Integer type
        Set<Integer> firstSet = new HashSet<Integer>();
        // Adding all elements to List
        firstSet.addAll(Arrays.asList(new Integer[] { 1, 3, 2, 4, 8, 9, 0 }));

        // with reference to HashSet
        Set<Integer> secondSet = new HashSet<Integer>();
        secondSet.addAll(Arrays.asList(new Integer[] { 1, 3, 7, 5, 4, 0, 7, 5 }));


        // Iki Set in birlesimi
        Set<Integer> union = new HashSet<Integer>(firstSet);
        union.addAll(secondSet);
        System.out.println("Iki Set in birlesimi " +union);

        // Iki Set in ortak elemanlari
        Set<Integer> intersection = new HashSet<Integer>(firstSet);
        intersection.retainAll(secondSet);
        System.out.println("Iki Set in ortak elemanlari "+intersection );

        // Iki Set in farki
        Set<Integer> difference = new HashSet<Integer>(firstSet);
        difference.removeAll(secondSet);
        System.out.println("Iki Set in farki "+difference);







    }
}
