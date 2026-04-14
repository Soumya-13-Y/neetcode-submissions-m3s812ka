class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = 0;
        for (int p : piles) {
            max = Math.max(max, p);
        }

        int low = 1, high = max;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (calculateTime(piles, mid,h) <= h) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    int calculateTime(int[] piles, int speed,int h) {
        int hours = 0;
        for (int p : piles) {
            hours += (p + speed - 1) / speed;
             if (hours > h) return hours; 
        }
        return hours;
    }
}