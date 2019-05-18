import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IntegerListSort {
    public static void main (String[] args)
    {
        List<Integer> integerList = new ArrayList<>();
        for(int i = 0; i < 100; i++){
            integerList.add((int) (Math.random()*100));
        }
        System.out.println("Произвольный список значений: \n" + integerList);
        Collections.sort(integerList);
        System.out.println("Список значений в порядке возрастания: \n" + integerList);
        Collections.reverse(integerList);
        System.out.println("Список значение в порядке убывания: \n" + integerList);
    }
}
