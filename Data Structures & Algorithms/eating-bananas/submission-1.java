class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max=0;
        for(int i=0;i<piles.length;i++){
            max=Math.max(max,piles[i]);
        }
int low=1;
int high=max;
while(low<=high){
    int mid=low+(high-low)/2;
       
            int requiretime=calculateTime(piles,mid);
            if(requiretime<=h){
                high=mid-1;
            }else if(requiretime>h){
                low=mid+1;
            }
}
        return low;
    }

   int calculateTime(int[] piles, int h){
    int hour=0;
    for(int i=0;i<piles.length;i++){
        hour+=(piles[i] + h - 1) / h;
    }
    return hour;
   }
}
