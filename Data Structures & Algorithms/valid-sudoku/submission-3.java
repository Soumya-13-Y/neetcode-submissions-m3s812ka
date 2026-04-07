class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> h=new HashSet<String>();
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                if(board[i][j]!='.'){
                String rowKey=board[i][j]+" row "+i;
                String colKey=board[i][j]+" col "+j;
                String boxKey=board[i][j]+" box "+(i/3*3+j/3);
                if(!h.add(rowKey)|| !h.add(colKey)|| !(h.add(boxKey))){
                   
                    return false;
                }}
            }
        }
        return true;
    }
}
