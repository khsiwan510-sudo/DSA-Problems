class Solution {
    public void moveZeroes(int[] arr) {
        int i = 0, j = 1;
        while(j<arr.length){
            if(arr[i] != 0){
                i++;
                j++;
            }
            else{
                if(arr[j] != 0){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    // j++;
                }
                else{
                    j++;
                }
            }
            
        }
        
    }
}