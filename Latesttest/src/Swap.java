
public class Swap {

	static void swap(int m, int n) {
		int temp=m;
		m=n;
		n=temp;
		System.out.println("value of m is"+m+"and value of n is"+n);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int m=3;
int n=5;

swap(m,n);
	}

}
