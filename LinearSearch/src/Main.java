import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list =  new ArrayList<>();
        list.add(1);        list.add(2);        list.add(3);        list.add(4);        list.add(5);
        list.add(6);        list.add(7);        list.add(8);        list.add(9);        list.add(10);

        Integer result = linearSearch(list, 6);
        verify(result);
    }

    public static Integer linearSearch(List<Integer> list, int target) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(target)) return i;
        }
        return null;
    }

    public static void verify(Integer index) {
        if (index != null) {
            System.out.println("Target found at index: " + index);
        } else {
            System.out.println("Target not found in list ");
        }
    }
}

