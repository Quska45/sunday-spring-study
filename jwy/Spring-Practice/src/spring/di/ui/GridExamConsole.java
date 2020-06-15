package spring.di.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import spring.di.entity.Exam;

@Component("console")
public class GridExamConsole implements ExamConsole {
    
    @Autowired
    private Exam exam;
    
    public GridExamConsole() {
        System.out.println("constructor");
    }
    
    public GridExamConsole(Exam exam ) {
        System.out.println("overloaded constructor");
        this.exam = exam;
    }
    
    @Override
    public void print() {
        if(exam == null) System.out.println("null print");
        else {
            System.out.printf("%3d    %3.2f", 
                    exam.total(), exam.avg());
        }
        
    }
    
    @Override
    public void setExam(Exam exam) {
        System.out.println("setter");
        this.exam = exam;
    }
    
}
