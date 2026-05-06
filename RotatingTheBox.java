class Solution {
    public char[][] rotateTheBox(char[][] arr) {
        // check each row , start from right to left 
        // empty -> last idx(n-1) se start kroo
        // agar * mila -> wall -> j-1;
        // # mila -> empty pe bhej do 
        int m = arr.length; // rows
        int n = arr[0].length; // coln
        for(int i=0;i<m;i++){
            int empty = n-1;
            for(int j=n-1;j>=0;j--){
                if(arr[i][j]=='*'){
                    empty = j-1;
                }
                else if(arr[i][j] == '#'){
                    char temp = arr[i][empty];
                    arr[i][empty] = '#';
                    arr[i][j] = temp;
                    empty--;
                }
            }

        }
        char ans[][] = new char[n][m];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                ans[j][m-1-i] = arr[i][j];
            }
        }
        return ans;
    }
}
