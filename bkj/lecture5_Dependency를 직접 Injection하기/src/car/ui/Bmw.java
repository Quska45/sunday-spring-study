package car.ui;

import car.entity.Tire;

public class Bmw implements Car{

	Tire tire;
	
	//1. 객체는 생성자로 주입할 수 있다.
//	public Bmw(Tire tire) {
//		// TODO Auto-generated constructor stub
//		this.tire = tire;
//		
//	}
	
	//2. 객체를 setter로 주입 해줄 수도 있다.
	public void setTire(Tire tire) {
		// TODO Auto-generated method stub
		this.tire = tire;
	}
	
//	public Tire getTire() {
//		return tire;
//	}
	
	public void lightOn() {
		System.out.println("Bmw의 불이 켜졌습니다.");
	}
	

	public void lightOff() {
		System.out.println("Bmw의 불이 꺼졌습니다.");
	}
	
	@Override
	public void rollTire() {
		// TODO Auto-generated method stub
		tire.roll();
	}
	
}
