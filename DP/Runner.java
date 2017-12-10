public class Runner
{
	public static void main(String[] args) {
	
/*
	String a = "geek";
	String b = "gesek";
	EditDistance e = new EditDistance(a,b);
	long startTime = System.nanoTime();
	int ans = e.TableFindEditDistance();
	long endTime = System.nanoTime();	
	long duration = endTime - startTime;
	double secs = (float)duration / 1000000;

	System.out.println("Ans  = "+ans);
	System.out.println("Time taken = "+secs+" ms");
	*/

	BinomialCoefficient b1 = new BinomialCoefficient(5,2);
	System.out.println("Ans  = "+b1.findBino());

	}
}