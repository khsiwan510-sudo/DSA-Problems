class Solution {
    public int findMaxConsecutiveOnes(int[] arr) {
        int i = 0, j = 0, maxOne = 0, count = 0;
        while(i<arr.length){
            if(arr[i] == 1){
                count++;
                if(count>maxOne) maxOne = count;
            }else{
                count = 0;
            }
            i++;
        }
        return maxOne;
        
    }
}