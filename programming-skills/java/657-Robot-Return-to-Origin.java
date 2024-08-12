// for (char c : moves.toCharArray() 
//  e mult mai eficient decat 
//  for(int i = 0; i < moves.length(); i++){
//          if(moves.charAt(i) == 'L'){

class Solution {
    public boolean judgeCircle(String moves) {
        int rl = 0, ud = 0;

        for (char c : moves.toCharArray() ){
            if(c == 'L'){
                rl++;
            }
            else if(c == 'R'){
                rl--;
            }
            else if(c == 'D'){
                ud++;
            }
            else if(c == 'U'){
                ud--;
            }
        }
        
        return(rl == 0 && ud == 0);
    }
}

//only beats 35%
class Solution {
    public boolean judgeCircle(String moves) {
        int l = 0, r = 0, u = 0, d = 0;

        for(int i = 0; i < moves.length(); i++){
            if(moves.charAt(i) == 'L'){
                l++;
            }
            else if(moves.charAt(i) == 'R'){
                r++;
            }
            else if(moves.charAt(i) == 'D'){
                d++;
            }
            else if(moves.charAt(i) == 'U'){
                u++;
            }
        }
        if(d != u || l != r) return false;
        return true;
    }
}
