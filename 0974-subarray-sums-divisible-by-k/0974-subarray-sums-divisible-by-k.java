class Solution {
    public int subarraysDivByK(int[] a, int k) {
          Map<Integer,Integer> f=new HashMap<>();
        f.put(0,1);
        int sum=0,freq=0;
        for(int i=0;i<a.length;i++){
            sum+=a[i];
            int rem=sum%k;
            if(rem<0)
                rem=rem+k;

             freq+=f.getOrDefault(rem,0);
             f.put(rem,f.getOrDefault(rem,0)+1);
            
        }
        return freq;
    }
}