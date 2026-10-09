class Solution {
    public boolean isValidSudoku(char[][] board) {

        HashMap<Character, Integer>[] ColMap = new HashMap[9];
        HashMap<Character, Integer>[] BoxMap = new HashMap[9];

        for(int i = 0; i < 9; i++) {
            ColMap[i] = new HashMap<>();
            BoxMap[i] = new HashMap<>();
        }

        for(int i = 0; i < board.length; i++) {
            HashMap<Character, Integer> Row = new HashMap<>();

            for(int j = 0; j < board[i].length; j++) {
                HashMap<Character,Integer> tempCol = ColMap[j];

                char current = board[i][j];
                if(current == '.') {
                    continue;
                }

                int id = (i/3)*3 + (j/3);
                HashMap<Character,Integer> tempBox = BoxMap[id];

                if(Row.get(current) != null || tempCol.get(current) != null || tempBox.get(current) != null) {
                    return false;
                }
                else {
                    Row.put(current, 1);
                    tempCol.put(current, 1);
                    tempBox.put(current, 1);
                    ColMap[j] = tempCol;
                    BoxMap[id] = tempBox;
                }
            }
        }

        return true;
    }
    
}
