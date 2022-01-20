
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		int fact=1;
		System.out.println("Factorial of "+n+" are:");
		
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		System.out.println(fact+" ");
	}

}
