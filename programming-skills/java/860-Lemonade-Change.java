/*
The time complexity of the algorithm is O(n), where n is the length of the bills array. We iterate over the array once.
The space complexity is O(1) because we are using only two variables fives and tens to keep track of the number of 5s and 10s we have.
*/
class Solution {
    public boolean lemonadeChange(int[] bills) {
        int fives = 0;
        int tens = 0;
        for(int i = 0; i < bills.length; i++){
            if(bills[i] == 5) fives++;
            else if(bills[i] == 10){
                if(fives == 0) return false;
                fives--;
                tens++;
            }
            else if(bills[i] == 20){
                // rest: 1 de 10 si un 5 ***SAU*** 3 de 5 
                // oricum ar fi, am nevoie de un 5
                if(fives == 0) return false;
                if(tens >= 1){
                    fives--; tens--;
                }
                else if(fives >= 3){
                    fives -= 3;
                }
                else return false;
            }
        }
        return true;
    }
}
