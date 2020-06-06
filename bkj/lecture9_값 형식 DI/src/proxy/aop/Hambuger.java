package proxy.aop;

//햄버거먹기 개발
public class Hambuger {

	public static void main(String[] args) {
		HambugerAOP hambuger = new HambugerAOP();
		
		hambuger.eatHambuger();
	}
	
	//주업무
	void eatHambuger() {
		CrossCuttingConcern ccc = new CrossCuttingConcern();
		ccc.washHand();
		System.out.println("햄버거를 먹자");
	}
	
}

class CrossCuttingConcern {
	//보조업무
	void washHand() {
		System.out.println("손을 씻자");
	}
}

class HambugerAOP{
	Hambuger hambuger = new Hambuger();
	CrossCuttingConcern ccc = new CrossCuttingConcern();
	
	void eatHambuger() {
		//주업무가 실행되기 전에 보조업무를 끼워 넣었다.(Cross Cutting 했다.)
		ccc.washHand();
		hambuger.eatHambuger();
	}
}