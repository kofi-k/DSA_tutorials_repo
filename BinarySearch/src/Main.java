import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);        list.add(2);         list.add(3);
        list.add(4);        list.add(5);         list.add(6);
        list.add(7);        list.add(8);         list.add(9);
        list.add(10);

        Integer result = binarySearch(list, 9);
        verify(result);

    }

    public static Integer binarySearch(List<Integer> list, int target) {
        int first = 0;
        int last = list.size() - 1;
        while (first <= last) {
            int midpoint = Math.round((first + last) >> 1);

            if(list.get(midpoint).equals(target)) return midpoint;
            else if (list.get(midpoint) < target) first = midpoint +1;
            else last = midpoint -1;

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

