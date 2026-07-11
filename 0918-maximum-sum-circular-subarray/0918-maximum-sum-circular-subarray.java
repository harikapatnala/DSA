class Solution {

    private int maxsumsubarray(int[] a){
        int n=a.length;
      int bestmax=a[0];
      int maxsum=a[0];
      for(int i=1;i<n;i++){
        int v1=a[i];
        int v2=a[i]+bestmax;
        bestmax=Math.max(v1,v2);
        maxsum=Math.max(maxsum,bestmax);
      }
      return maxsum;  
    }


    private int minsumsubarray(int[] a){
      int n=a.length;
      int bestmin=a[0];
      int minsum=a[0];
      for(int i=1;i<n;i++){
        int v1=a[i];
        int v2=a[i]+bestmin;
        bestmin=Math.min(v1,v2);
        minsum=Math.min(minsum,bestmin);
      }
      return minsum;
    }


    public int maxSubarraySumCircular(int[] a) {
    int a1=maxsumsubarray(a);
    int a2=minsumsubarray(a);
    int totalsumofarray=0;
     int n=a.length;
    for(int i=0;i<n;i++){
         totalsumofarray+=a[i];
    }
    if(a1<0)
     return a1;
    return Math.max(a1,totalsumofarray-a2);
    }
}