
public class Constructor_Demo {
	//if we will not write any constructor inside a class then system will provide default constructor
	//if we will write any constructor inside a class then system will not  provide default constructor
	//what is constructor?
	//constructor have the same name as class with small brackate.
	//constructor do not have return type.
	
	String name;
	String password;
	String email;
	String address;
	
	//default constructor means constructor without parameter
	Constructor_Demo(){
		
	}
	
	//parameterized  constructor means constructor with parameter
	Constructor_Demo(String name,String password, String email, String address){
		//how to make local variable , global
		//if we have to call global variable or method of a class so we can call using object
		//this is a pointer which will point to current class object so we can call all global variable using this
		//initialization means storing local variable value into global variable
		this.name=name;
		//  global variable<------local variable
		this.password=password;
		this.email=email;
		this.address=address;
	}
	
	//multiple constructor with different parameter is known as constructor overloading
	
	void add(){
		System.out.println("Name is "+this.name);
		System.out.println("Password is "+password);
		System.out.println("Email is "+email);
		System.out.println("Address is "+address);
	}
	
	void add(int i,int j){
		
	}
	
	//multiple methods with same name but different parameter is known as method overloading
	

	public static void main(String[] args) {
		Constructor_Demo a=new Constructor_Demo(); //creating object based on default constructor
		a.add();
		
		Constructor_Demo b=new Constructor_Demo("Rajesh","abcd","abc@yahoo.com","Bangalore");//creating object based on parameterized constructor
		b.add();

	}

}
