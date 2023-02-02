public static void main(String args[]) {
		Scanner sc =new Scanner(System.in);
		int n=5;
		int m=4;
		char arr[][]=new char[n][m];
		for(int i=0;i<n;i++){
			String s=sc.next();
			for(int j=0;j<s.length();j++){
				arr[i][j]=s.charAt(j);
			}
		}
		int ans[][]=new int[n][m];
		ratchaseitscheese(arr, 0, 0,ans);
		if(f==false){
			System.out.println("not found");
		}
	}
	static boolean f=false;
	public static void ratchaseitscheese(char [][]arr,int cr, int cc,int ans[][]){
		if(cr==arr.length-1 && cc==arr[0].length-1 && arr[cr][cc]!='X'){
			ans[cr][cc]=1;
			f=true;
			display(ans);
			return;
		}
		if(cr>=arr.length || cc>=arr[0].length || cr<0||cc<0||arr[cr][cc]=='X'){
			return;
		}
		arr[cr][cc]='X';
		ans[cr][cc]=1;
		int r[]={-1,1,0,0};
		int c[]={0,0,-1,1};
		for(int i=0;i<r.length;i++){
			ratchaseitscheese(arr, cr+r[i], cc+c[i], ans);
		}
		arr[cr][cc]='O';
		ans[cr][cc]=0;

	}
	public static void display(int arr[][]){
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[0].length;j++){
				System.out.print(arr[i][j]+" ");
			}System.out.println();
		}

	
}
