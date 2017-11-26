package FirstPackage;

public class MethodParametersPassByReference {

	public void set_value(int b)
	{
		b = 10;
	}
	
	public void set_value(int[] a )
	{
		a[0] = 10;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodParametersPassByReference m1 = new MethodParametersPassByReference();
		int x = 5;
		int[] y = {3};
		m1.set_value(x);
		System.out.println("Value of a after setting " + x);
		m1.set_value(y);
		System.out.println("value of b after setting " + y[0]);
		
		
	}

}
