public class Runner
{
	public static void main(String[] args) {
		KnightTour t1 = new KnightTour();
		boolean ans = t1.isTourAvail(0,0,0);
		System.out.println("\n Tour available = "+ans);
		t1.print();
	}
}