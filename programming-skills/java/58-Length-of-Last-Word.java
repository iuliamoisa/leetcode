/*
- caracterele se compara cu '' -> s.charAt(n) == ' ' corect; nu e corect s.charAt(n) == " "
- " " = string
*/

class Solution {
    public int lengthOfLastWord(String s) {
        int n = s.length() - 1;
        while(n >= 0 && s.charAt(n) == ' '){
            n--;
        }
        int nr = 0;
        while(n >= 0  && s.charAt(n) != ' '){
            nr++;
            n--;
        }
        return nr;
    }
}
