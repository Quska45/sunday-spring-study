package spring.di;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.di.entity.Exam;
import spring.di.entity.NewLecExam;
import spring.di.ui.ExamConsole;
import spring.di.ui.GridExamConsole;
import spring.di.ui.InlineExamConsole;

public class Program {
    
    public static void main(String[] args) {
        
        //Exam exam = new NewLecExam(); // 부품 
        
        // 스프링을 사용하지 않고 직접 주입하는 방법
        // 정적으로 소스를 작성했기 때문에 console 변경 시 높은 결합력을 가진다. 
        //ExamConsole console = new InlineExamConsole(exam); // DI
        //ExamConsole console = new GridExamConsole(); // DI
        //console.setExam(exam);
        
       
        // context가 DI 지시서를 읽고 Injection 까지 해서 IoC 컨테이너에 담고 있다.
        // bean id를 이용하여 꺼내 쓸수도 있고 타입을 이용하여 꺼내 쓸 수도 있다! 
        ApplicationContext context =
                new ClassPathXmlApplicationContext("spring/di/setting.xml");
        
        //Exam exam = context.getBean(Exam.class);
        //System.out.println(exam.toString());
        
        // 1. id 로 꺼내는 경우 (형 변환 해야 함)
        //ExamConsole console = (ExamConsole) context.getBean("console");
        ExamConsole console = context.getBean(ExamConsole.class);
        
        // 2. 타입으로 꺼내는 경우 
        //ExamConsole console2 = context.getBean(ExamConsole.class);
        
        console.print();
        // 자바 소스 코드에서 나타날 변화를 설정 (setting.xml로 분리 시킴으로써 Loose Coupling을 이룰수 있다. )
        
        //List<Exam> exams = new ArrayList<>();
        //List<Exam> exams = (List<Exam>) context.getBean("exams");
        
        //for(Exam e : exams)
        //    System.out.println(e);
    }
    
}
