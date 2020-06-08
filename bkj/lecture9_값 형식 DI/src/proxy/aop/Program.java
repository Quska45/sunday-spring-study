package proxy.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import proxy.aop.entity.Exam;
import proxy.aop.entity.NewLecExam;

public class Program {
	public static void main(String[] args) {
		Exam exam = new NewLecExam(1,1,1,1);
		
		//인스터스를 그냥 만들어줌
		//가짜 exam을 만들어준다고 할 수 있다.
		//Exam을 쓰는 것 처럼 사용자는 느낄 수 있지만 보조업무를 끼워 넣을 수 있게 된다.
		//첫 번째 인자 - NewLecExam의 기능을 사용할 수 있도록 사용하려는 객체의 정보를 넣어준다. 정확히는 클래스의 loader를 넣어주는 것이다.
		//첫 번째 인자  - 구현하고 있는 인터페이스들의 정보를 넣어준다. 여러개를 구현하고 있으면 전부 넣어주면 된다.
		//세 번째 인자  - 보조 업무를 꽂을 수 있는 부분이다. InvocationHandler라는 인터페이스를 구현하는 클래스를 객체화하는 작업을 해줘야 한다.
		//예제에서는 클래스를 작성하지않고 자바에서 제공하는 익명함수를 쓰도록 하겠다.
		Exam proxy = (Exam) Proxy.newProxyInstance(NewLecExam.class.getClassLoader(), new Class[] {Exam.class}, new InvocationHandler() {
			
			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				// TODO Auto-generated method stub
				long start = System.currentTimeMillis();
				
				//첫번째인자는 실제 업무를 가진 객체
				//두번째는 호출하려는 메소드들을 넣어준다.
				Object result = method.invoke(exam, args);
				
				long end = System.currentTimeMillis();
				String message = (end-start)+"ms 시간이 걸렸습니다.";
				System.out.println(message);
				
				return result;
			}
		});
		
		//proxy를 써주면 보조업무가 끼워넣어져서 출력된다.
		System.out.printf("total is %d\n", proxy.total());
		System.out.printf("total is %f\n", proxy.avg());
	}
}
