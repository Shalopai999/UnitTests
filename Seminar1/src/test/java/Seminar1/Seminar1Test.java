package Seminar1;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class Seminar1Test {

    @Test
    public void sumListShouldBeCorrect(){
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3));
        List<Integer> result = new ArrayList<>(Arrays.asList(2,4,6));
        List <Integer> resultTest =  Seminar1.sumLists(list1, list2);
        assertEquals(result, resultTest, "Сумма списков не верна!");
    }

    @Test
    public void findMax(){
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3));
        int result = 3;
        int resultTest = Seminar1.findMax(list1);
        assertEquals(result, resultTest, "Ошибка поиска максимального числа!");
    }

    @Test
    public void filterStrings(){
        List<String> list3 = new ArrayList<>(Arrays.asList("1234567", "123", "123456", "1234"));
        List<String> result = new ArrayList<>(Arrays.asList("1234567", "123456"));
        List<String> resultTest = Seminar1.filterStrings(list3, 5);
        assertEquals(result, resultTest, "Ошибка фильтрации строк!");
    }
}
