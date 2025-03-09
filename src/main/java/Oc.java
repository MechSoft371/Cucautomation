
public class Oc {
	
	int emid;
	String ename;
	String job;
	int sal;
	
	void display() {
		System.out.println(emid);
		System.out.println(ename);
		System.out.println(job);
		System.out.println(sal);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Oc emp1=new Oc();
		emp1.emid=123;
		emp1.ename="john";
		emp1.job="Manager";
		emp1.sal=34343456; 
		emp1.display();

	}

}
