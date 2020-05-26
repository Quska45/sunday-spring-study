package car.ui;

import car.entity.Tire;

public class Audi implements Car {
	
	Tire tire;
	
	//1. 객체는 생성자로 주입할 수 있다.
//	public Audi(Tire tire) {
//		// TODO Auto-generated constructor stub
//		this.tire = tire;
//	}
	
	//2. 객체를 setter로 주입 해줄 수도 있다.
	public void setTire(Tire tire) {
		// TODO Auto-generated method stub
		this.tire = tire;
	}
	
	@Override
	public void lightOff() {
		// TODO Auto-generated method stub
		System.out.println("아우디의 불이 꺼졌습니다.");
	}
	
	@Override
	public void lightOn() {
		// TODO Auto-generated method stub
		System.out.println("아우디의 불이 켜졌습니다.");
	}
	
	@Override
	public void rollTire() {
		// TODO Auto-generated method stub
		tire.roll();
	}
	
}
