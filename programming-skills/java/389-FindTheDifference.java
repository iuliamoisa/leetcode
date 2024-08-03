/*
easy solution - 88% 
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
/*
XOR - x ^ 0 = x;   x ^ x = 0
se anuleaza caracterele identice intre ele (se ajunge la 0 cu XOR - a ^ a = 0)
ramane caracterul unic ptc 0 ^ car = car
xor e asociativa si comutativa deci intr-un final, cele 2 foruri ajung la (a ^ a) ^ (b ^ b) ^ x = 0 ^ 0 ^ x = x
*/


class Solution {
    public char findTheDifference(String s, String t) {
        char c = 0;
        for(char cs : s.toCharArray()) c ^= cs;
        for(char ct : t.toCharArray()) c ^= ct;
        return c;
    }
}
