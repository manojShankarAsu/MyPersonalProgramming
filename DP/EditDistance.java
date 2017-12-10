import java.util.Map;
import java.util.HashMap;
class EditDistance
{
	String s1;
	String s2;
	Map<String,Integer> map = new HashMap<String,Integer>();
	int[][] table ;

	public EditDistance(String a , String b)
	{
		s1= a;
		s2= b;
		table = new int[s1.length()+1][s2.length()+1];
	}

	public int min(int a, int b)
	{
		return a < b ? a:b;
	}

	public int min(int a, int b, int c)
	{
		return min(min(a,b),c);
	}

	public int MemFindEditDistance(String a, String b)
	{
		if(map.get(a+":"+b) != null)
		{
			return map.get(a+":"+b);
		}
		int val = findEditDistance(a,b);
		map.put(a+":"+b,val);
		System.out.println("For "+a+" & "+b+" val = "+val);
		return val;
	}


	public int TableFindEditDistance()
	{
		for(int i=s1.length();i>=0;i--)
		{
			for(int j=s2.length();j>=0;j--)
			{
				if(i == s1.length() && j == s2.length())
				{
					table[i][j]=0;
				}
				else if(i == s1.length())
				{
					table[i][j] = s2.length()-j;
		 		}
		 		else if(j == s2.length())
				{
					table[i][j] = s1.length()-i;
				}
				else if(s1.charAt(i) == s2.charAt(j))
				{
					table[i][j] = table[i+1][j+1];
				}
				else
				{
					table[i][j] = 1 + min(table[i+1][j],table[i][j+1],table[i+1][j+1]);
				}
			}
		}
		System.out.println("Table \n");
		for(int i=0;i<=s1.length();i++)
		{
			for(int j=0;j<=s2.length();j++)
			{
				System.out.print(table[i][j]+"\t");
			}
			System.out.println("\n");
		}
		return table[0][0];
	}

	public int findEditDistance(String a, String b)
	{
		if(a.equals(""))
		{
			return b.length();
		}
		if(b.equals(""))
		{
			return a.length();
		}

		if(a.charAt(0) == b.charAt(0))
		{
			return MemFindEditDistance(a.substring(1,a.length()) , b.substring(1,b.length()));
		}
		return 1 + min( min(MemFindEditDistance(a.substring(1,a.length()) , b.substring(1,b.length())) , MemFindEditDistance(a.substring(1,a.length()) , b)),MemFindEditDistance(a , b.substring(1,b.length())));
	}

}