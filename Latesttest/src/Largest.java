
public class Largest {
	
	static int largest(int x, int y, int z) {
		
		if(x>=y && x>=z) 
			return x;
		
		else
			if(y>=x&&y>=z) 
				return y;
			
			return z;
		}
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a,b,c,l;
		a=10;
		b=1000;
		c=79;
	l=largest(a,b,c); 
		System.out.println("largest value is:"+l);
		
	}
	}

