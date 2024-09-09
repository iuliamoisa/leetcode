class Solution {
    public boolean checkDiagonals(char[][] grid){
        boolean verif1 = true;
        boolean verif2 = true;
        char first = grid[0][0];
        if(first != '-'){
            for(int i = 0; i < grid.length; i++){ // diagonala principala
                if(grid[i][i] != first){
                    verif1 = false;
                    break;
                }
            }
        } else {
            verif1 = false;
        }
        
        first = grid[0][grid.length-1];
        if(first != '-'){
            for(int i = 0; i < grid.length; i++){ //diagonala secundara
                if(grid[i][grid.length-1-i] != first){
                    verif2 = false;
                    break;
                }
            }
        } else {
            verif2 = false;
        }
        
        return verif1 || verif2;
    }


    public boolean checkMatrix(char[][] grid){
        for(int i = 0; i < grid.length; i++){ // verificare linie cu linie
            boolean verif = true;
            char first = grid[i][0];
            if(first != '-') {
            for(int j = 1; j < grid[i].length; j++){
                if(grid[i][j] != first){
                    verif = false;
                    break;
                }
            }
            if(verif) return verif;
            }
        }
        for(int j = 0; j < 3; j++){ // verificare coloana cu coloana
            boolean verif2 = true;
            char first = grid[0][j];
            if(first != '-'){
                for(int i = 1; i < 3; i++){
                    if(grid[i][j] != first){
                        verif2 = false;
                        break;
                    }
            }
            if(verif2) return verif2;
            }
            
        }
        return false;
    }
    boolean checkFull(char[][] grid){
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(grid[i][j] == '-') return false;
            }
        }
        return true;
    }
    public String tictactoe(int[][] moves) {
        char[][] grid = new char[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                grid[i][j] = '-';
            }
        }
        int n = moves.length;

        for(int i = 0; i < n; i++){
            int row = moves[i][0];
            int column = moves[i][1];
            if(i % 2 == 0){
               grid[row][column] = 'X';
            }
            else grid[row][column] = 'O';
            if(i >= 4){
                if(checkDiagonals(grid)){
                    if(i % 2 == 0) return "A";
                    return "B";
                }
                if(checkMatrix(grid)){
                    if(i % 2 == 0) return "A";
                    return "B";
                }
                
            }
        }
        if(checkFull(grid)){
            return "Draw";
        } else {
            return "Pending";
        }
    }
}



