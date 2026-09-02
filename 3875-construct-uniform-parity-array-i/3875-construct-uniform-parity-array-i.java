class Solution {
    public boolean uniformArray(int[] nums1) {
        int oddCount = 0;
        for (int num : nums1) {
            if (num % 2 != 0) oddCount++;
        }
        
        // All-even possible only if oddCount != 1
        boolean allEvenPossible = (oddCount != 1);
        // All-odd possible only if oddCount >= 1
        boolean allOddPossible = (oddCount >= 1);
        
        return allEvenPossible || allOddPossible;
    }
}