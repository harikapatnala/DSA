import java.util.*;

class Solution {
    class Pair{
        int first;
        String second;
        Pair(int f,String s){
            first=f;
            second=s;
        }
    }

public List<String> topKFrequent(String[] words, int k) {
        
        Map<String,Integer> freq=new HashMap<>();
        for(String word:words){
            freq.put(word,freq.getOrDefault(word,0)+1);
        }

        PriorityQueue <Pair> pq=new PriorityQueue<>((a,b)->{
            if(a.first!=b.first)
                return a.first-b.first;
            return b.second.compareTo(a.second);
        });

        for(Map.Entry<String,Integer> entry:freq.entrySet()){
            String word=entry.getKey();
            int frequency=entry.getValue();
            pq.add(new Pair(frequency,word));

            if(pq.size()>k){
                pq.poll();
            }
        }
        List<String> result=new ArrayList<>();
        for(int i=0;i<k;i++){
            result.add(pq.poll().second);
        }
        Collections.reverse(result);
        return result;
    }
}