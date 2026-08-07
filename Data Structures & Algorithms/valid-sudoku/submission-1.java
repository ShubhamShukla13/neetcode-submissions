class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        Set<String> test=new HashSet<>();//Set Rows
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                char ch=board[i][j];
                if(ch== '.')continue;
                int boxIndex=(i/3)*3+(j/3);
                if(!test.add("row"+i+ch) || !test.add("col"+j+ch)|| !test.add("box"+boxIndex+ch)){
                    return false;
                }
            }
        }
        return true;
    }
}
