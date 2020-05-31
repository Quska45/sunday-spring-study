package spring.di;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.di.entity.Exam;
import spring.di.entity.NewLecExam;
import spring.di.ui.ExamConsole;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		스프링에 지시하는 방법으로 변경
//		Exam exam = new NewLecExam();
//		ExamConsole console = new GridExamConsole();
//		
//		console.setExam(exam);
//		
		
//		ApplicationContext context1 = new ClassPathXmlApplicationContext("spring/di/setting.xml");
		ApplicationContext context = new AnnotationConfigApplicationContext(NewlecDIConfig.class);
		
//		Exam exam = context.getBean(Exam.class);
//		System.out.println(exam.toString());
		//이름으로 꺼내오면 형식을 Object로 꺼내오기 때문에 형변환을 해줘야 한다.
		ExamConsole console  = (ExamConsole) context.getBean("console");
//		ExamConsole console  = context.getBean(ExamConsole.class, "console");
		console.print();
		
//		List<Exam> exams = new ArrayList<>();
//		exams.add(new NewLecExam(1,1,1,1));
		
//		List<Exam> exams = (List<Exam>)context.getBean("exams");
//		exams.add(new NewLecExam(1,1,1,1));
		
//		for(Exam e : exams)
//			System.out.println(e);
		
	}

}
