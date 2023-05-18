class Solution{
    static long maximumSumSubarray(int K, ArrayList<Integer> Arr,int N){
       // code here
        long ans=Integer.MIN_VALUE;
        long curr_sum=0;
        int i=0;
        int j=K;
        for( i=0;i<K;i++){
            curr_sum+=Arr.get(i);
        }
        ans=curr_sum;
        while(j<N){
            curr_sum+=Arr.get(j)-Arr.get(i);
            ans=Math.max(ans,curr_sum);
            i++;
            j++;
        }
        return ans;
        