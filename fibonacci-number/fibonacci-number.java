class Solution {
    public int fib(int n) {
        int a=0;
        int b=1;
        if(n==0)
            return a;
        if(n==1)
            return b;
        if(n==2)
            return a+b;
        int c=a+b;
        for(int i=2;i<n;i++)
        {
            a=b;
            b=c;
            c=a+b;
        }
        return c;
    }
}