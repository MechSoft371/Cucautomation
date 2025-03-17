package oops;

public class encapsulation {
	//this keywords
	
	//where we have use this keyword
	static int x; //class or instance variable
	static int y;
	
	void setData(int x, int y) {//here x,y are local variables
		//  in this case when local variables and class variable same, how exceuor will understand the  which x is assigning the value?
		// this keyword represent the class name
		this.x=x;
		this.y=y; 
	}
	
	void display() {
		System.out.println(x +" ,"+y);
	}
	
	
	public static void main(String[] args) {
		//when we create any variable inside the method body is called local variable
		
		encapsulation e=new encapsulation();
		e.setData(4, 5);
		e.display();
		
	}

}
