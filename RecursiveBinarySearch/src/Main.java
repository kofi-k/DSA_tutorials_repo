import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);        list.add(2);         list.add(3);        list.add(4);        list.add(5);
        list.add(6);        list.add(7);        list.add(8);         list.add(9);        list.add(10);

        Boolean result = recursiveBinarySearch(list, 0);
        verify(result);

    }

    public static Boolean recursiveBinarySearch(List<Integer> list, int target) {
        if(list.size() == 0) return Boolean.FALSE;
        else
        {
            int midpoint = Math.round((list.size() >> 1));
            if(list.get(midpoint).equals(target)) return Boolean.TRUE;
            else {
                if (list.get(midpoint) < target)
                    return recursiveBinarySearch(list.subList(midpoint+1, list.size()), target);
                else
                    return recursiveBinarySearch(list.subList( 0, midpoint), target);
            }
        }

    }

    public static void verify(Boolean result) {
        System.out.println("Target found: " + result);
    }
}

