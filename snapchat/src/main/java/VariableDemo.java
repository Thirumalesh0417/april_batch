
public class VariableDemo {
	static byte b;
	static short s;
	static int i;
	static long l;
	static float f;
	static double d;
	static char c;
	static boolean b1;
	
	//for global variable system will assign default value
	//however for local variable we have to assign value 

	public static void main(String[] args) {
		System.out.println("byte "+b);
		System.out.println("short "+s);
		System.out.println("int"+i);
		System.out.println("long "+l);
		System.out.println("float "+f);
		System.out.println("double "+d);
		System.out.println("char "+c);
		System.out.println("boolean "+b1);
		
		int i1=9;
		System.out.println(i1);
		
		int i2=5;

		Integer i3=new Integer(5);

	}

}
