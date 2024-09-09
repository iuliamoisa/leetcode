class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
      /* 
      A = (x1,y1) |
                  | => slope1 = (y2-y1)/(x2-x1)|
      B = (x2,y2) |                            | --coliniare--> slope1=slope2 <=> (y2-y1)(x3-x2)=(y3-y2)(x2-x1)
                  | => slope2 = (y3-y2)/(x3-x2)|
      C = (x3,y3) |

      => punctele sunt coliniare dacă pantele oricăror două perechi de puncte consecutive sunt egale.
      Colinearitatea între puncte--> toate punctele se află pe aceeași linie dreaptă.
      Dacă toate perechile de puncte consecutive au aceeași pantă, atunci punctele sunt coliniare.
      */
        int x1 = coordinates[0][0];
        int y1 = coordinates[0][1];
        int x2 = coordinates[1][0];
        int y2 = coordinates[1][1];
        for (int i = 2; i < coordinates.length; i++) {
            int x3 = coordinates[i][0];
            int y3 = coordinates[i][1];
            if ((x3 - x2) * (y2 - y1) != (x2 - x1) * (y3 - y2)) {
                return false; 
            }
        }
        
        return true; 
    }
}
