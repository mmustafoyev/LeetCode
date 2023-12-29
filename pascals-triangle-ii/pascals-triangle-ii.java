class Solution {
    public List<Integer> getRow(int rowIndex) {
       if(rowIndex == 0) return List.of(1);
        else if(rowIndex == 1) return List.of(1,1);
        else{
            List<Integer> list = getRow(rowIndex - 1);
            List<Integer> result = new LinkedList<>();
            result.add(1);
            for (int i = 0; i < list.size() - 1; i++) {
                result.add(list.get(i) + list.get(i + 1));
            }
            result.add(1);
            return result;
        }
    }
}