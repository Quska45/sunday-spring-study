package spring.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.di.entity.Exam;
import spring.di.entity.NewLecExam;
import spring.di.ui.ExamConsole;
import spring.di.ui.GridExamConsole;
import spring.di.ui.InlineExamConsole;
import sun.awt.windows.awtLocalization_ko;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		스프링에 지시하는 방법으로 변경
//		Exam exam = new NewLecExam();
//		ExamConsole console = new GridExamConsole();
//		
//		console.setExam(exam);
//		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/di/setting.xml");
		
		//이름으로 꺼내오면 형식을 Object로 꺼내오기 때문에 형변환을 해줘야 한다.
		ExamConsole console  = (ExamConsole) context.getBean("console");
//		ExamConsole console  = context.getBean(ExamConsole.class, "console");
		console.print();
	}

}
