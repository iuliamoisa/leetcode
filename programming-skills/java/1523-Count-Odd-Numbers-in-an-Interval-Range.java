        /* 
        (high + 1) / 2 -> nr de impare de la 0 la high
            high = 7 -> nr impare = 8/2 = 4 (1,3,5,7)
            high = 6 -> nr impare = 7/2 = 3 (1,3,5)
        low/2 -> nr de impare de la 0 la low-1 
            low = 3 -> nr impare = 3/2 = 1 (1)
            low = 6 -> nr impare = 6/2 = 3 (1,3,5)
        */

class Solution {
    public int countOdds(int low, int high) {
        return (high + 1) / 2 - low / 2;
    }
}
