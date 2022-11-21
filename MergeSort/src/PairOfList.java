import java.util.List;

final class PairOfList {
    private final List<Integer> leftList;
    private final List<Integer> rightList;

    PairOfList(List<Integer> leftList, List<Integer> rightList) {
        this.leftList = leftList;
        this.rightList = rightList;
    }
    public List<Integer> getLeftList(){
        return leftList;
    }
    public List<Integer> getRightList(){
        return rightList;
    }
}
