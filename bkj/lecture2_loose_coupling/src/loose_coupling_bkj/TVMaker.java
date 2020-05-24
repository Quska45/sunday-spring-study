package loose_coupling_bkj;

public class TVMaker {
	public static void main(String[] args) {
		SamsungTV tv = new SamsungTV();
		tv.powerOn();
		tv.powerOff();
		tv.volumUp();
		tv.volumDown();
	}
	
}

class SamsungTV implements TV {
	public void powerOn() {
		System.out.println("SamsungTV---전원 켠다.");
	}
	public void powerOff() {
		System.out.println("SamsungTV---전원 끈다.");
	}
	public void volumUp() {
		System.out.println("SamsungTV---소리 올린다.");
	}
	public void volumDown() {
		System.out.println("SamsungTV---소리 내린다.");
	}
}

class LGTV implements TV {
	public void powerOn() {
		System.out.println("LgTV---전원 켠다.");
	}
	public void powerOff() {
		System.out.println("LgTV---전원 끈다.");
	}
	public void volumUp() {
		System.out.println("LgTV---소리 올린다.");
	}
	public void volumDown() {
		System.out.println("LgTV---소리 내린다.");
	}
}