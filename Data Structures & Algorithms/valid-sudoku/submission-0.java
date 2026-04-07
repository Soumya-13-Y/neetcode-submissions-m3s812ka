class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<board.length;i++){
          Set<Character> row=new HashSet<Character>();
          Set<Character> col=new HashSet<Character>();
          Set<Character> grid=new HashSet<Character>();
          for(int j=0;j<board[i].length;j++){
if(board[i][j] !='.' && !col.add(board[i][j])){
return false;
}
if(board[j][i] !='.' && !row.add(board[j][i])){
return false;
}
int subrow=3*(i/3)+(j/3);
int subcol=3*(i%3)+(j%3);
if(board[subrow][subcol] !='.' && !grid.add(board[subrow][subcol])){
return false;
}
          }
        }
        return true;
    }
}
