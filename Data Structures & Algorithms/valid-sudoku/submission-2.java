class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<board.length;i++){
           if(!checkIsValidRow(board, i)){
            return false;
           }
            if(!checkIsValidColumn(board, i)){
            return false;
           }

            }
            for(int row = 0; row < 9; row += 3){
    for(int col = 0; col < 9; col += 3){
        if(!checkIsValidGrid(board, row, col)){
            return false;
        }
    }
}
            return true;
        }
    

   boolean checkIsValidRow(char[][]board,int row){
    HashSet<Character> h=new HashSet<>();
    for(int i=0;i<board.length;i++){
        if(board[row][i]!='.'){
        if(!h.add(board[row][i])){
            return false;
        }}}
        return true;
        }

        boolean checkIsValidColumn(char[][]board,int col){
    HashSet<Character> h=new HashSet<>();
    for(int i=0;i<board.length;i++){
             if(board[i][col]!='.'){
        if(!h.add(board[i][col])){
            return false;
        }
             }
    }
    return true;
   }
boolean checkIsValidGrid(char[][] board, int rowStart, int colStart){
    HashSet<Character> h = new HashSet<>();

    for(int i = rowStart; i < rowStart + 3; i++){
        for(int j = colStart; j < colStart + 3; j++){
            if(board[i][j] != '.'){
                if(!h.add(board[i][j])){
                    return false;
                }
            }
        }
    }
    return true;
}
    
    }

