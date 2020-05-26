package make_pen;

public class Pen {
	Cap cap;
	Case penCase;
	Ink ink;
	InkCase inkCase;
	Spring spring;
	
	public Pen(Cap cap, Case penCase, Ink ink, InkCase inkCase, Spring spring) {
		// TODO Auto-generated constructor stub
		this.cap = cap;
		this.penCase = penCase;
		this.ink = ink;
		this.inkCase = inkCase;
		this.spring = spring;
	}
	
	public void writing(String text) {
		System.out.println(text);
	}
}
