class Solution {
    public int maxArea(int[] height) {
        int i = 0, j = height.length-1;
        int area = 0;
        while(i<j){
            int length = j - i;
            if(height[i] < height[j]){                
                int heights = height[i];
                int currentArea = (length*heights);
                if(currentArea>= area) area = currentArea;
                i++;
            }else{
                int currentArea = length * height[j];
                if(currentArea >= area) area = currentArea;
                j--;
            }
        }return area;
    }
}