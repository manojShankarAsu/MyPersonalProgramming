class BinomialCoefficient
{
	int n;
	int k;
	int[][] table;

	 public BinomialCoefficient(int n, int k)
	 {
	 	this.n= n;
	 	this.k = k;
	 	table = new int[n+1][k+1];
	 }

	 public int min(int a , int b)
	 {
	 	return a > b ? b : a;
	 }
	public int findBino()
	{
		for(int i=0;i<=n;i++)
		{
			for (int j=0; j<=min(i,k);j++ ) {
				

				if(j == 0 || j == i)
				{
					table[i][j]=1;
				}
				else
				{
					table[i][j] = table[i-1][j-1] + table[i-1][j];
				}

				
			}
		}

		System.out.println("\n Table \n");
		for(int i=0;i<=n;i++)
		{
			for (int j=0; j<=min(i,k);j++ ) {
					System.out.print(table[i][j]+"\t");
			}
		}
		return table[n][k];
	}
}