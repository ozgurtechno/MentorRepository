package array_arraylist;

import java.util.*;

public class ArrayListDemo {


    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>(4);
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        System.out.println(numbers);

        ArrayList<Integer> numbers2 = new ArrayList<>(numbers);
        System.out.println(numbers2);

        ArrayList<Integer> numbers3 = new ArrayList<>(Arrays.asList(10,20,30));
//        ArrayList<Integer> numbers4 = new ArrayList<>(List.of(30,20,10));

        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("Honda", 2002));
        cars.add(new Car("Honda", 2002));
        cars.add(new Car("Honda", 2002));

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        for (Car car : cars) {
            System.out.println(car);
        }

        numbers3.addAll(numbers);
        System.out.println("numbers3 = " + numbers3);

        numbers3.clear();
        System.out.println("numbers3 = " + numbers3);

        System.out.println("numbers3.isEmpty() = " + numbers3.isEmpty());

        numbers2.remove(1);
        System.out.println("numbers2 = " + numbers2);

        numbers.removeAll(numbers2);
        System.out.println("numbers = " + numbers);

        Collections.sort(numbers2);
        System.out.println("numbers4 = " + numbers2);

        System.out.println(numbers2.get(1));
        System.out.println(numbers.get(0));


        //ArrayList<int> numbers6 = new ArrayList<int>();

        MyArrayList numbers7 = new MyArrayList(10);
        numbers7.add(10);
        numbers7.add(20);
        System.out.println(numbers7);

        // 2 boyutlu ArrayList

        ArrayList < ArrayList<Integer> > numberList = new ArrayList<>();
        numberList.add(numbers2);
        numberList.add(numbers3);
        numberList.add(numbers2);
        System.out.println(numberList);

        ArrayList<Integer> nubbb = new ArrayList<>(Arrays.asList(10,20,30));
        ArrayList<Integer> kx = new ArrayList<>(Arrays.asList(150,520,430));

        ArrayList < ArrayList<Integer> > numberList2 = new ArrayList<>();

        numberList2.add(nubbb);
        numberList2.add(kx);


    }

}
