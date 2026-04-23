class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums2.length>nums1.length){
            return findMedianSortedArrays(nums2,nums1);
        }

        int left=(nums1.length+nums2.length+1)/2;
         int    low=0;
        int high=nums1.length;
        int mid=0;
        int mid2=0;
      
        while(low<=high){
         mid=low+(high-low)/2;
         mid2=left-mid;
          if(mid2 < 0){
                high = mid - 1;
                continue;
            }
            if(mid2 > nums2.length){
                low = mid + 1;
                continue;
            }
         int l1 = (mid == 0) ? Integer.MIN_VALUE : nums1[mid - 1];
            int l2 = (mid2 == 0) ? Integer.MIN_VALUE : nums2[mid2 - 1];

            int r1 = (mid == nums1.length) ? Integer.MAX_VALUE : nums1[mid];
            int r2 = (mid2 == nums2.length) ? Integer.MAX_VALUE : nums2[mid2];

        if(l1>r2){
high=mid-1;
        }else if(l2>r1){
low=mid+1;
        }else{
              if((nums1.length+nums2.length) % 2 == 0){
                    return ((double)Math.max(l1, l2) + Math.min(r1, r2)) / 2;
                } else {
                    return (double)Math.max(l1, l2);
                }
        }
        
        }
    return 0;
        
    }
}
