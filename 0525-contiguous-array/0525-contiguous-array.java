class Solution {
    public int findMaxLength(int[] a) {
        Map<Integer,Integer> firstseen=new HashMap<>();
        firstseen.put(0,-1);
        int prefixsum=0,maxlen=0;
        for(int i=0;i<a.length;i++){
            prefixsum+=(a[i]==0)?-1:1;
            if(firstseen.containsKey(prefixsum)){
                maxlen=Math.max(maxlen,i-firstseen.get(prefixsum));
            }
            else{
                firstseen.put(prefixsum,i);
            }
        }
        return maxlen;
    }
}