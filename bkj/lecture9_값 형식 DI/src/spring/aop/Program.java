package spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.aop.entity.Exam;

public class Program {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/aop/setting.xml");
		
		/*
		 * 3가지를 생성하려고 한다.
		 * 1. exam인스턴스 생성
		 * 2. 프록시 생성
		 * 3. 보주업무, 주업무 로직 생성
		 */
		
		Exam proxy = (Exam) context.getBean("exam");
		
		System.out.printf("total is %d\n", proxy.total());
		System.out.printf("total is %f\n", proxy.avg());
	}
}
