package make_pen;

public class PenMaker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cap cap = new Cap();
		Case penCase = new Case();
		Ink ink = new Ink();
		InkCase inkCase = new InkCase();
		Spring spring = new Spring();
		
		Pen pen = new Pen(cap, penCase, ink, inkCase, spring);
		
		pen.writing("스터디");
	}

}
