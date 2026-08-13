class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder neww = new StringBuilder();
        int i = 0;
        String n = s.toLowerCase();
        while(i<s.length()){
            int asci = (int)n.charAt(i);
            if((asci>=97 && asci <= 122) || (asci>=48 && asci<=57)){
                neww.append(n.charAt(i));
            }
            i++;
        }
        i = 0;
        int j = neww.length()-1;
        while(i<=j){
            if(neww.charAt(i) != neww.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}