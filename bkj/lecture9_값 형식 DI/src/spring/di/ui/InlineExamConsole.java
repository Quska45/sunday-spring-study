package spring.di.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import spring.di.entity.Exam;

@Component("console") //id를 지정했기 때문에 다른 곳에서 id로 찾아서 사용할 수 있다. 
//@Component //id를 지정하지 않았기 때문에 다른 곳에서는 타입으로만 사용할 수 있다. 
public class InlineExamConsole implements ExamConsole {
	
	@Autowired(required = true)
	@Qualifier("exam")
	private Exam exam;

	public InlineExamConsole() {
		// TODO Auto-generated constructor stub
		System.out.println("constructor");
	}
	
//	@Autowired
//	@Qualifier("exam2")
	public InlineExamConsole(Exam exam) {
		System.out.println("overloaded Constructor");
		this.exam = exam;
	}


//	@Autowired
//	@Qualifier("exam2")
	@Override
	public void setExam(Exam exam) {
		// TODO Auto-generated method stub
		System.out.println("setter");
		this.exam = exam;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		if(exam == null) {
			System.out.printf("total is %d, avg is %f\n", 0, 0.0);
		} else {
			System.out.printf("total is %d, avg is %f\n", exam.total(), exam.avg());
		}
	}
}
