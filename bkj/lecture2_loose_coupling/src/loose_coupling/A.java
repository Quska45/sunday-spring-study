package loose_coupling;

public class A {
	private X x;

	public void setX(X x) {
		this.x = x;
	}
	
	public A() {
		// TODO Auto-generated constructor stub
	}
	
	public void print() {
		int total = x.total();
		
		System.out.print("total is " + total);
	}
}
