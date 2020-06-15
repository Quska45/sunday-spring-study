package spring.di.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class NewLecExam implements Exam {
    
    @Value("#{config['exam.kor']}")
    private int kor;
    @Value("#{config['exam.eng']}")
    private int eng;
    private int math;
    private int com;
    
    public NewLecExam() {
        
    }
    
    public NewLecExam(int kor, int eng, int math, int com) {
        this.kor = kor;
        this.eng = eng;
        this.math = math;
        this.com = com;
    }
    


    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getCom() {
        return com;
    }

    public void setCom(int com) {
        this.com = com;
    }

    @Override
    public int total() {
        // TODO Auto-generated method stub
        return kor+eng+math+com;
    }
    
    @Override
    public String toString() {
        return "NewLecExam [kor=" + kor + ", eng=" + eng + ", math=" + math + ", com=" + com + "]";
    }

    @Override
    public float avg() {
        // TODO Auto-generated method stub
        return total() / 4.0f;
    }
    
}
