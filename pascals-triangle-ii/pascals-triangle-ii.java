class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i <= rowIndex; ++i) {
            result.add(1);
            for (int j = i - 1; j > 0; --j) {
                result.set(j, result.get(j) + result.get(j - 1));
            }
        }
        return result;
    }
}

/*List<Integer> result = new ArrayList<Integer>();
        Queue<Integer> queue = new ArrayDeque<>();
        Queue<Integer> oldqueue = new ArrayDeque<>();
        result.add(1);
        if(rowIndex == 0)return result;
        result.add(1);
        if(rowIndex == 1) return result;
        int k = 2;
        oldqueue.add(1);
        oldqueue.add(1);
        for (int i = 2; i <= rowIndex; i++){
            k = i;
            queue.add(1);
            while(!oldqueue.isEmpty()) {
                queue.add(oldqueue.poll() + oldqueue.peek());
                if(oldqueue.size() == 1){
                    oldqueue.poll();
                    queue.add(1);
                }
            }
            oldqueue.addAll(queue);
            queue = new ArrayDeque<>();

        }
        result.clear();
        while(!oldqueue.isEmpty()){
            result.add(oldqueue.poll());
        }
        return result;*/