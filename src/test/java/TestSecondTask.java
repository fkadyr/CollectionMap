import homework.SecondTask;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.List;

public class TestSecondTask {

    @Test
    public void testCountingNumberOfDuplicate() {
        int n = 3;
        List<Integer> list = List.of(1,2,2,3,3,3,4,4,4,5,5,5,6,6,6);
        List<Integer> actual = List.of(3,4,5,6);
        List<Integer> expected = SecondTask.countingNumberOfDuplicate(list, n);
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void testCountingNumberOfDuplicate2() {
        int n = 2;
        List<Integer> list = List.of(1,2,2,3,3,4,4,5,5,6,6,7,7,8,8,9,9,10,10,10,10,10);
        List<Integer> actual = List.of(2,3,4,5,6,7,8,9,10);
        List<Integer> expected = SecondTask.countingNumberOfDuplicate(list, n);
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void testCountingNumberOfDuplicate3() {
        int n = 1;
        List<Integer> list = new ArrayList<>();
        List<Integer> actual = new ArrayList<>();
        List<Integer> expected = SecondTask.countingNumberOfDuplicate(list, n);
        Assertions.assertEquals(actual, expected);
    }
}
