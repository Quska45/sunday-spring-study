package car.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import car.entity.Tire;
import car.ui.Audi;
import car.ui.Bmw;
import car.ui.Car;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Tire tire = new Tire();
//		Car car = new Bmw(tire);
		ApplicationContext context = new ClassPathXmlApplicationContext("/car/di/setting.xml");
		
		Car car = (Car)context.getBean("bmw"); 
		
		car.lightOn();
		car.lightOff();
		car.rollTire();
		
		//여기서 bmw의 tire멤버로 접근하고 싶은데 안된다.
		//타입에 관한 문제 때문이라고 생각된다. Car라는 타입의 인터페이스에는 getTire가 없기 때문에 접근할 수 없게 된다.
		//실제로 위의 bmw객체를 Bmw로 생성하게 되면 정상적으로 getTire를 사용할 수 있게 된다.
		//예제에서 제시한 내용은 tire 멤버에 직접 접근하는 방식이 아니고 Car의 구현체의 메서드에서 tire에 접근해서 값을 보여주는 방식으로 구현 했다.
	}

}
