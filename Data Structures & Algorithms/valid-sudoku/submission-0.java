class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashMap<Integer,Set<Character>> rows =new HashMap<>();
        HashMap<Integer,Set<Character>> cols=new HashMap<>();
        //Set Rows
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                char c=board[i][j];
                char h=board[j][i];
                if(rows.get(i).contains(c)){
                    return false;
                }else {
                    rows.put(i,rows.get(i).add(c));
                }
                if(cols.get(j).contains(h)){
                    return false;
                } else{
                    cols.put(j,cols.get(j).add(h));
                }
            }
        }
        Set<Character> temp=new HashSet<>();
        int x=0,y=0;
        for(int a=0;a<9;a++){
            for(int i=x;i<x+3;i++){
                for(int j=y;j<y+3;j++){
                    char ch=board[i][j];
                    if(temp.contains(ch)){
                        return false;
                    }else{
                        temp.add(ch);
                    }
                }
            }
            temp=new HashSet<>();
            y=y+3;
            if(y>9){
                x+=3;
                y=0;
            }

        }
        return true;
    }
}
