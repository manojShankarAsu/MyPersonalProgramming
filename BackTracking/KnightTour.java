class KnightTour
{
	int chess[][];
	int visited[][];
	//int count=0;
	int rows = 8;
	public KnightTour()
	{
		chess = new int[rows][rows];
		visited = new int[rows][rows];
		for (int i=0;i<rows ;i++ ) {
			for (int j=0;j<rows ;j++ ) {
				chess[i][j] = -1;
				visited[i][j]=0;
			}
		}
	}
	
	public boolean isTourAvail(int i , int j, int move)
	{
		if(i < 0 || j < 0 || i > (rows-1) || j > (rows-1) || chess[i][j] != -1 )
		{
			return false;
		}
		
		chess[i][j] = move;
		if (move == rows*rows-1) {
			return true;
		}
		if(move > 61){
		System.out.println("Checking i="+i+" j="+j+" move="+move);
	}

		
		
		boolean possible = false;
		possible = isTourAvail(i+2,j+1,move+1);
		if (!possible) {
			possible = isTourAvail(i+2,j-1,move+1);
		}
		if (!possible) {
			possible = isTourAvail(i-2,j+1,move+1);
		}
		if (!possible) {
			possible = isTourAvail(i-2,j-1,move+1);
		}
		if (!possible) {
			possible = isTourAvail(i+1,j+2,move+1);
		}
		if (!possible) {
			possible = isTourAvail(i+1,j-2,move+1);
		}
		if (!possible) {
			possible = isTourAvail(i-1,j+2,move+1);
		}
		if (!possible) {
			possible = isTourAvail(i-1,j-2,move+1);
		}

		if (!possible) {
			chess[i][j] = -1;
		}
		return possible;
	}


	public void print()
	{
		System.out.println("\n Chess");
		for (int i=0;i<rows ;i++ ) {
			for (int j=0;j<rows ;j++ ) {
				System.out.print(chess[i][j]+"\t");
			}
			System.out.println("\n");
		}
	}

}