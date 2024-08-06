/*
folosesc un pointer pt a retine pozitia primului element nul din array; 
dupa ce aflu pe ce pozitie este primul element nul, incerc sa gasesc primul element nenul, ca sa il mut in locul elementului nul
stiu sigur ca pana la firstZeroFound elementele sunt asezate asa cum trb, adica sunt nenule, deci lucrez
strict cu elementele de dupa firstZeroFound
fac verificarea: sa fie nenul elementul de dupa firstZeroFound; daca este, fac interschimbarea cu elementul
nul, adica cel de pe pozitia firstZeroFound
apoi updatez firstZeroFound, incrementandu-l cu 1, ca sa fiu sigura ca dupa firstZeroFound nu e un element sau mai multe nule,
peste care am sarit atunci in for, cu verificarea if (nums[i] != 0)
*/
class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int firstZeroFound = 0;
        while (firstZeroFound < n && nums[firstZeroFound] != 0) {
            firstZeroFound++;
        }
        for (int i = firstZeroFound + 1; i < n; i++) {
            if (nums[i] != 0){
                nums[firstZeroFound] = nums[i];
                nums[i] = 0;
                firstZeroFound ++;
            }

        }
    }
}
