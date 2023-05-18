class Compute {
    
    public long[] printFirstNegativeInteger(long A[], int N, int K)
    {
        int i=0;
        int j=0;
        int idx=0;
        Queue<Long> q=new LinkedList<>();
        long[] res=new long[N-K+1];
        
        while(j<N)
        {
            if(A[j]<0)
            {
                q.add(A[j]);
            }
            if(j-i+1==K)
            {
                if(q.size()==0)
                {
                    res[idx++]=0;
                }
                else
                {
                    res[idx++]=q.peek();
                    if(A[i]==q.peek())
                    {
                        q.poll();
                        
                    }
        
                }
                i++;
            }
            j++;
        }
         return res;
    }
}
