package car.ui;

import car.entity.Tire;

public interface Car {
	//타이어 까지 Car인터페이스에 받는 코드를 가지고 있어야 한다.
	//위와 같은 생각은 아주 잘 못 됐다. 인터페이스의 멤버는 final로 만들어 지기 때문에 다음과 같은 코드는 불가능하다.
	//이렇게 코딩하고 싶으면 객체를 만들어서 넣어주든가 해야한다.
	public Tire tire = null;
//	public Tire tire = new Tire();
//	public void setTire(Tire tire);
	
	//자동차 인터페이스의 고유한 기능
	public void lightOn();
	public void lightOff();
	public void rollTire();
}
