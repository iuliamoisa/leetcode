// diag principala -> i==j;
// altfel i == n-i-1 -> diagonala secundara; dar in acest caz, daca matricea
// are dimensiunea impara, elementul central se ia de 2 ori, deci fac verificarea i!=n-i-1
class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        int n = mat.length;

        for(int i = 0; i < n; i++){
            sum += mat[i][i];
            if (i != n - i - 1) { 
                sum += mat[i][n - i - 1];
            }
        }

        return sum;
    }
}

//ineficient:

class Solution { // [0][2]; [1][1] ; [2][0]
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[i].length; j++){
                if(i == j) sum += mat[i][j];
            }
            sum += mat[i][mat.length - i -1];
        }
        if(mat.length % 2 == 1){
            sum -= mat[mat.length/2][mat.length/2];
        }
        
        return sum;
    }
}
