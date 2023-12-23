package homework;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class FirstTask {
    public static void main(String[] args) {
        Random random = new Random();

        Map<Integer, String> map = new HashMap<>();
        Integer[] keys = new Integer[100];
        String[] values = {"task1", "task2", "task3", "task4", "task5"};

        Arrays.setAll(keys, i -> random.nextInt(10000));

        for (Integer key : keys) {
            map.put(key, values[random.nextInt(5)]);
        }

        int z = 0;
        for (Integer i: map.keySet()) {
            System.out.printf("Key - %s | Value - %s | %s \n", i, map.get(i), z);
            z++;
        }

        map.clear();

        System.out.println("Словарь пустой - " + map.isEmpty());
    }
}
