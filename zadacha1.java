
public class zadacha1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			foo(3, 4);
		
	}

	 public static int foo (int x, int y)
	    {
	   	if (y == 0)
	     	    return x;
	   	else
	     	    return foo(y, x % y);
	    }

	
}
