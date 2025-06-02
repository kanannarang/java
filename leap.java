public class leap {
    
    public static void main(String[] args) {
		int a=1;
		int b=6;
		int c=-5;
		
		int d= b*b - 4*a*c;
		if (d<0)
		{
			System.out.println("roots are imaginatry");
		}
		else
		{
			double x1 =( -b + Math.sqrt(d))/2*a;
			double x2 =( -b + Math.sqrt(d))/2*a;
			
			System.out.println(x1);
			System.out.println(x2);
		}
	}

}


	
    

