class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;
        
        for (int i = 0; i < n; i++) {
            Set<Character> seen = new HashSet<>();
            int len = 0;
            for (int j = i; j < n; j++) {
                if (seen.contains(s.charAt(j))) {
                    break;
                }
                seen.add(s.charAt(j));
                len++;
            }
            maxLength = Math.max(maxLength, len);
        }
        
        return maxLength;
    }
}