class Solution {
    public boolean isPalindrome(int x) {
        int reverse = 0, original = x;
        if(x < 0 ) return false;
        else if (x == 0) return true;
        else{
            while(x>0){
                int lastDigit = x % 10;
                reverse = reverse*10 + lastDigit;
                x = x / 10;
            }
        }
        if( original == reverse) return true;
        return false;
    }
}