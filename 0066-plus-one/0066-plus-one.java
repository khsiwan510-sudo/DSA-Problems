class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        int[] result = new int[n+1];        
        int carry = 1;
        for( int i = n-1; i >= 0; i--){
            if ( digits[i] + carry <= 9){
                digits[i] += 1;
                carry = 0;
                return digits;
            }
            digits[i] = 0;
            result[0] = 1;
        }
        
        for( int i = 0; i < n; i++){
            result[i+1] = digits[i];
        }
        
        return result;       
    }
}