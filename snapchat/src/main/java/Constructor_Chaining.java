class A extends Object{
	A(){
		super();
		System.out.println("A");
	}
}

class B extends A{
	B(){
		super();
		System.out.println("B");
	}
}

class C extends B{
	C(){
		super();
		System.out.println("C");
	}
}
public class Constructor_Chaining {

	public static void main(String[] args) {
		C c1=new C();

	}

}
