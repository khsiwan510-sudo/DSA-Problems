class Solution {
    public int findDuplicate(int[] nums) {
        Set<Integer> num = new HashSet<>();
        for(int numb: nums){
            if( !num.add(numb)){
            return numb;

            }
        }
        return -1;
    }
}