class Solution {
    public int pivotIndex(int[] a) {
     int n=a.length;
     int prefix=0;
     int sum=0;
     for(int i=0;i<n;i++){
        sum+=a[i];
     }
     for(int i=0;i<n;i++ ){
        int suffix=sum-prefix-a[i];
        if(prefix==suffix){
            return i;
        }
             prefix+=a[i];
     }   
     return -1;
    }
}