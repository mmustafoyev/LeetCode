import java.util.Set;
import java.util.HashSet;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Arrays;



class Solution {
    public int openLock(String[] deadends, String target) {
        Set<String> deadendSet = new HashSet<>(Arrays.asList(deadends));
        Set<String> visited = new HashSet<>();
        Queue<String> queue = new LinkedList<>();
        int moves = 0;
        queue.offer("0000");
        visited.add("0000");
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i = 0; i < size; i++){
                String current = queue.poll();
                if(current.equals(target))
                    return moves;
                if(deadendSet.contains(current))
                    continue;
                
                for(int j = 0; j < 4; j++){
                    String nextPlus = rotateWheel(current, j, 1);
                    String nextMinus = rotateWheel(current, j, -1);
                    if(!visited.contains(nextPlus) && !deadendSet.contains(nextPlus)){
                        queue.offer(nextPlus);
                        visited.add(nextPlus);
                    }
                    if(!visited.contains(nextMinus) && !deadendSet.contains(nextMinus)){
                        queue.offer(nextMinus);
                        visited.add(nextMinus);
                    }
                }
            }
            moves++;
        }
        return -1;
    }
    
    public String rotateWheel(String s, int j, int dir){// j-> wheelIndex , dir -> direction
        char[] c = s.toCharArray();
        int digit = c[j] - '0';
        digit = (digit + dir + 10) % 10;
        c[j] = (char)(digit + '0');
        return new String(c);
    }
}