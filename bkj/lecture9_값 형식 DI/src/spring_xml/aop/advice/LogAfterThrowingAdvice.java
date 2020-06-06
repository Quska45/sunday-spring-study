package spring_xml.aop.advice;

import org.springframework.aop.ThrowsAdvice;

//이건 구현할 메소드가 정해질 수 없다.
//어떤 예외가 발생할지에 따라 구현 해야하는게 달라짐
//befor -> 타겟 메소드 -> afterReturning
//                  -> 타겟 에러 발생시에는 여기로
public class LogAfterThrowingAdvice implements ThrowsAdvice {
	public void afterThrowing(IllegalArgumentException e) throws Throwable {
		System.out.println("예외 발생" + e.getMessage());
	}
}
