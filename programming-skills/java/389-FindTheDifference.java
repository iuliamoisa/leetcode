/*
easy solution - 88% 

!!!!!!!!!!!!!!!!!!!!!!!!!1 vezi solutii de pe leetcode cu operatii pe biti sau ascii 
*/

class Solution {
    public char findTheDifference(String s, String t) {
        for(int i = 0; i < t.length(); i++){
            if(s.indexOf(t.charAt(i)) == -1)
             return(t.charAt(i));
        }
        return 0;
    }
}
