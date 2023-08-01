import java.util.List;
import java.util.ArrayList;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>(List.of(1)));
        List<Integer> temp = new ArrayList<Integer>();
        List<Integer> last = new ArrayList<Integer>(List.of(1,1));
        if(numRows >=2 ) result.add(last);
        for(int i = 3; i <= numRows; i++) {
            temp = new ArrayList<Integer>();
            temp.add(1);
            for (int j = 0; j < i - 2; j++) {
                temp.add(last.get(j) + last.get(j + 1));

            }
            temp.add(1);
            result.add(temp);
            last = temp;
        }
        return result;
    }
}