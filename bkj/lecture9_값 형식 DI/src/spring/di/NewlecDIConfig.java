package spring.di;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import spring.di.entity.Exam;
import spring.di.entity.NewLecExam;
import spring.di.ui.ExamConsole;
import spring.di.ui.InlineExamConsole;

@ComponentScan("spring.di.ui")
@Configuration
public class NewlecDIConfig {
	@Bean
	public Exam exam() {
		return new NewLecExam(1,1,1,1);
	}
}
