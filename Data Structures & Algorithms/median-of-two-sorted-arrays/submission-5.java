class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] arr=new int[nums1.length+nums2.length];
        if(nums1.length+nums2.length<=1){
            if(nums1.length>=1 && nums2.length<=0){
                return (double) nums1[0];
            }else{
                return (double)nums2[0];
            }
        }
        int i=0;
        for( i=0;i<nums1.length;i++){
            arr[i]=nums1[i];
        }
         for(int j=i;j<i+nums2.length;j++){
            arr[j]=nums2[j-i];
        }
        Arrays.sort(arr);
     
        int mid=(nums1.length+nums2.length)/2;
        if((nums1.length+nums2.length)%2!=0){
            return (double)arr[mid];
        }else{
            double z=((double)arr[mid-1]+(double)arr[mid])/2;
            return z;
        }
    }
}
