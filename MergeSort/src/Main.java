import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> unsortedList = new ArrayList<>();
        unsortedList.add(11);       unsortedList.add(23);       unsortedList.add(3);
        unsortedList.add(10);       unsortedList.add(2);        unsortedList.add(6);
        unsortedList.add(7);        unsortedList.add(8);        unsortedList.add(19);
        unsortedList.add(1);        unsortedList.add(5);        unsortedList.add(13);
        List<Integer> sortedAndMerged = merge_sort(unsortedList);
        System.out.println("Unsorted List "+unsortedList);
        System.out.println("List after merge sort "+ sortedAndMerged);
        System.out.println("Verify list well sorted: "+ verifySortedList(sortedAndMerged).toString().toUpperCase());
    }
    public static List<Integer> merge_sort(List<Integer> list){
        if (list.size() <= 1)
            return list;
        List<Integer> leftList  = merge_sort(split(list).getLeftList());
        List<Integer> rightList  = merge_sort(split(list).getRightList());

        return merge_list(leftList, rightList);
    }

    public static PairOfList split(List<Integer> list){
        int mid = list.size()/2;
        List<Integer> leftList = list.subList(0, mid);
        List<Integer> rightList = list.subList(mid, list.size());

        return new PairOfList(leftList, rightList);
    }

    public static List<Integer> merge_list(List<Integer> leftList, List<Integer> rightList){
        List<Integer> mergedList = new ArrayList<>();
        int left = 0; int right = 0;

        while (left < leftList.size() && right < rightList.size()){
            if(leftList.get(left) < rightList.get(right)){
                mergedList.add(leftList.get(left));
                left += 1;
            }else {
                mergedList.add(rightList.get(right));
                right += 1;
            }
        }
        while (left < leftList.size()){
            mergedList.add(leftList.get(left));
            left += 1;
        }
        while (right < rightList.size()){
            mergedList.add(rightList.get(right));
            right += 1;
        }
        return mergedList;
    }
    public static Boolean verifySortedList(List<Integer> list){
        int listSize = list.size();
        if (listSize == 0 || listSize == 1)
            return Boolean.TRUE;

        return list.get(0) < list.get(1) && verifySortedList(list.subList(1, list.size()));
    }
}

