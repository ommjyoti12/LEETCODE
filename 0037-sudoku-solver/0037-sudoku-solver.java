class Solution {
   boolean solve(char[][] board,int r,int c){
    if(r==board.length){
        return true;
    }
    int nr,nc=0;
    if(c==board[0].length-1){
       nc=0;
       nr=r+1;

    }else{
        nc=c+1;
        nr=r;
    }
    if(board[r][c]!='.'){
       if( solve(board,nr,nc)) return true;
    }
    else{
        for(char k='1';k<='9';k++){
         if(  isvalid(board,r,c,k)) {
            board[r][c]=k;
            if(solve(board,nr,nc)) return true;
            board[r][c]='.';
         }

        }
    }
    return false;

   }
   boolean isvalid(char[][] board,int r,int c,char k){
    for(int i=0;i<9;i++){
        if(board[r][i]==k) return false;
        if(board[i][c]==k) return false;
    }
    int sr=(r/3)*3;
    int sc=(c/3)*3;
    for(int p=0;p<3;p++){
       for(int o=0;o<3;o++){
      if(board[sr+p][sc+o]==k) return false;
       }
    }
    return true;
   }

    public void solveSudoku(char[][] board) {
        solve(board,0,0);
    }
}