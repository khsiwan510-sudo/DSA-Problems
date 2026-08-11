class Solution {
    public int reverse(int x) {
        long y = x;
        long ans = (y>0)? helper(y,0):(-1)*helper((-1)*y,0);
        return (ans < Integer.MIN_VALUE || ans > Integer.MAX_VALUE)? 0:(int)ans;
    }
    public long helper(long n, long reverse){
        if(n<=0){
            return reverse;
        }
        return helper(n/10,reverse*10+(n%10));
    }
}