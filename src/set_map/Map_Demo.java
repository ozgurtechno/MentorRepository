package set_map;

import array_arraylist.Car;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Map_Demo {

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("Merhaba", "Dunya");
        map.put("Bugun", "Cuma");
        map.put("Yarin", "Tatil");

        System.out.println("map.get(\"Merhaba\") = " + map.get("Merhaba"));

        System.out.println(map);

//      Map<Integer, Integer> numbersMap = new HashMap<>((Map) List.of(10,20,30));
//      System.out.println("numbersMap = " + numbersMap);

        Map<Car, Integer> objectMap = new HashMap<>();
        objectMap.put(new Car("Honda", 2020), 5);
        objectMap.put(new Car("Honda", 2019), 7);
        objectMap.put(new Car("Honda", 2023), 2);
        System.out.println(objectMap);

        // How to iterate over  a map
        for (Car car : objectMap.keySet()){
            System.out.println(car);
        }

        for (Integer each : objectMap.values()){
            System.out.println(each);
        }

        for(Map.Entry<Car, Integer> eachMapKeyValueSet : objectMap.entrySet()){
            System.out.println(eachMapKeyValueSet.getKey());
            System.out.println(eachMapKeyValueSet.getValue());
        }

        // Soru
        // Verilen String icerisindeki harflerin ne kadar tekrar ettigini Map kullanarak bulunuz...
        System.out.println("----------------------------------------");
        String word = "Merhaba Dunya";



























        Map<Character, Integer> countCharacter = new HashMap<>();

        for (Character ch : word.toCharArray()){
            countCharacter.put(ch, countCharacter.getOrDefault(ch, 0) + 1);
        }

        for (Map.Entry<Character, Integer> each : countCharacter.entrySet()){
            System.out.println(each.getKey()+" harfi "+each.getValue()+" kere tekrar etmektedir" );
        }



    }
}
