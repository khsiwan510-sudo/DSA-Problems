class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double median = 0;
        int[] mergedArray = new int[nums1.length + nums2.length];
        int i = 0, j =0, k = 0;
        while( i < nums1.length && j < nums2.length){
            if( nums1[i] > nums2[j]){
                mergedArray[k++] = nums2[j++];
            }else{
                mergedArray[k++] = nums1[i++];
            }
        }
        if( i == nums1.length ){
            while( j < nums2.length){
                mergedArray[k++] = nums2[j++];
            }
        }else{
            while( i < nums1.length){
                mergedArray[k++] = nums1[i++];
            }
        }
        int n = mergedArray.length;
        if( n % 2 != 0){            
            median = mergedArray[n/2];            
        }else{            
            median = (mergedArray[(n-2)/2] + mergedArray[(n/2)])/2.0;
        }
        
        return median;
    }
}