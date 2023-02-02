public static void main(String args[]) {
		char[][] board = { { 'A', 'B', 'C', 'E' }, { 'S', 'F', 'C', 'S' }, { 'A', 'D', 'E', 'E' } };
		String word="ABCCED";
		for(int i=0;i<board.length;i++){
			for(int j=0;j<board[0].length;j++){
					if(board[i][j]==word.charAt(0)){
						boolean ans=word_search(board, word, i, j, 0);
						if(ans==true){
							System.out.println(ans);
							return;
						}
					}
			}
		}
		System.out.println("false");
	}
	public static boolean word_search(char[][] maze,String word,int cr,int cc,int idx ){
		if(idx==word.length()){
			return true;
		}
		if( cc<0 ||cc>=maze[0].length||cr<0 ||cr>=maze.length || maze[cr][cc]!=word.charAt(idx)){
			return false;
		}


		int r[]={-1,1,0,0};
		int c[]={0,0,1,-1};
		maze[cr][cc]='*';//infinite recursio se bachne k liye
		for(int i=0;i<r.length;i++){
			boolean ans=word_search(maze, word, cr+r[i], cc+c[i], idx+1);
			if(ans==true){
				return ans;
			}
		}
		maze[cr][cc]=word.charAt(idx);//undo
		return false;
	}
}
