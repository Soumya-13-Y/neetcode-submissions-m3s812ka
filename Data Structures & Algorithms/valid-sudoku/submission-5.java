class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<board.length;i++){
            if(!checkrow(i,board)){
                return false;
            }
            if(!checkcolumn(i,board)){
                return false;
            }
        
            }


            for(int i=0;i<board.length;i=i+3){
                for(int j=0;j<board[i].length;j=j+3){
                    HashSet<Character> h=new HashSet<>();
                    for(int r=i;r<i+3;r++){
                        for(int c=j;c<j+3;c++){
if(board[r][c]!='.'){
    if(!h.add(board[r][c])){
        return false;
    }
}
                        }
                    }
                }
                


            }
            return true;
        }
    

    boolean checkrow(int row,char[][]board){
        HashSet<Character> h=new HashSet<>();
for(int j=0;j<board.length;j++){
    if(board[row][j]!='.'){
if(!h.add(board[row][j])){
    return false;
}
    }
}
return true;
    }

    boolean checkcolumn(int column,char[][]board){
        HashSet<Character> h=new HashSet<>();
for(int i=0;i<board.length;i++){
    if(board[i][column]!='.'){
if(!h.add(board[i][column])){
    return false;
}
    }
}
return true;
    }


}