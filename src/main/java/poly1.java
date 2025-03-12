
public class poly1 {
	
	int g1;
	int g2;
	int g3;
	// constructor overloading we have one 1 default constructor and two parameterized constructor
	// constructor should have same as class name
	//constructor should have different datatype parameters
	//number of paramters should be different
	//order of parameters should be different
	poly1(){
		
	}
	
	//polymorphism- one methods can have multiple forms
	
	// how can we achieve the polymorphism>> by using method overloading
	// method name should have same name
	// number of arguments should have different
	// datatypes of parameters should be different
	// order of the parameters should be different.
	
	void add() {
		System.out.println("Method with no argument");
		}
	
	void add(int i, int j, int k) {
		g1=i;
		g2=j;
		g3=k;
		System.out.println(g1+g2+g3);
	}
	
	void add(int j) {
		g1=g2=g3=j;
		System.out.println(g2);
		
	}
}

