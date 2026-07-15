class Solution {
    public int reverse(int x) {
        if( x == 0 ) return 0;
        long reverse = 0;
        if(x>0){
            while(x>0){
                int lastDigit = x % 10;
                reverse = reverse*10 + lastDigit;
                x = x/10;
            }           
        }
        else{
            int nums = (-1)*x;
            long negReverse = 0;
            while(nums>0){
                int unidigit = nums % 10;
                negReverse = negReverse*10 + unidigit;
                nums = nums/10;
            }
            reverse = (-1)*negReverse;
        }
        if(reverse < Integer.MIN_VALUE || reverse > Integer.MAX_VALUE) return 0;
        else return (int)reverse;
        
    }
}