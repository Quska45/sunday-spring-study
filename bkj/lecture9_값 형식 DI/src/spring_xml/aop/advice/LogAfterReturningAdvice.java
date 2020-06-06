package spring_xml.aop.advice;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class LogAfterReturningAdvice implements AfterReturningAdvice {

	//비포랑 비교해서 보면 좋은데 returnValue가 있는 이유는 코어를 실행 후에 리턴을 사용할 수 있도록 하는 것이다.
	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("returnValue: "+returnValue + ", method: "+method.getName());
	}

}
