package array_arraylist;

import java.util.Arrays;

public class MyArrayList {
    int[] numbers;
    static int count;

    public MyArrayList(int size) {
        this.numbers = new int[size];                   // int[5]
    }                                                   // 1,2,3,4,5
                                                        // int[10] 1,2,3,4,5
                                                        // int[10] 1,2,3,4,5,0,0,0,0,0
    public boolean add(int value){
        if (numbers.length == count){
            int[] newNumbers = new int[count * 2];
            for (int i = 0; i < numbers.length; i++) {
                 newNumbers[i] = numbers[i];
            }
            numbers = newNumbers;
            return true;
        }
        this.numbers[count++] = value;
        return true;
    }

    @Override
    public String toString() {
        return "MyArrayList{" +
                "numbers=" + Arrays.toString(numbers) +
                '}';
    }
}
