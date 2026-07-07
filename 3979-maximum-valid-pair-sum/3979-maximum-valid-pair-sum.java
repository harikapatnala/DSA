// class Solution {
//     public int maxValidPairSum(int[] a, int k) {
        // int max=0;
        // int n=a.length;
        // for(int i=0;i<n;i++){
        //     for( int j=i+1;j<n;j++){
        //         if(j-i>=k){
        //             int sum=a[i]+a[j];
        //             max=Math.max(sum,max);
        //         }
        //     }
        // }
        // return max;




        // 2pointer technique
        class Solution {
    public int maxValidPairSum(int[] nums, int k) {
        int n=nums.length;
        int m=nums[0];
        int a=Integer.MIN_VALUE;
        for(int j=k;j<n;j++){
            m=Math.max(m,nums[j-k]);
            a=Math.max(a,m+nums[j]);
        }
        return a;
    }
}
//     }
// }