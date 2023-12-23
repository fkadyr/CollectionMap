package homework;

import java.util.*;

public class SecondTask {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество повторений - ");
        int n = scanner.nextInt();
        List<Integer> list =random.ints(100,1,11)
                .boxed()
                .toList();
        System.out.printf("Элементы которые повторяются %s раз\n", n);
        countingNumberOfDuplicate(list, 10).forEach(System.out::println);
    }

    public static List<Integer> countingNumberOfDuplicate(List<Integer> list, int n) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> repeatEl = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            map.put(i, list.get(i));
        }
        for (int i = 1; i <= 10; i++) {
            int count = 0;
            for (Integer j: map.keySet()) {
                if (map.get(j).equals(i)) {
                    count++;
                }
            }
            if (n<=count) {
                repeatEl.add(i);
            }
        }
        return repeatEl;
    }
}
