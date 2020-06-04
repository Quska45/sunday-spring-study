package spring.aop.entity;

//@Component("exam2")
public class NewLecExam implements Exam {

	private int kor;
	private int eng;
	private int math;
	private int com;
	
	
	
	public NewLecExam() {
	}

	public NewLecExam(int kor, int eng, int math, int com) {
		super();
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.com = com;
	}

	//보조업무를 끼워넣기 위해 변수를 리턴하도록 바꿧다.
	@Override
	public int total() {
		// TODO Auto-generated method stub
		//long start = System.currentTimeMillis();
		
		int result = kor+eng+math+com;
		
		if(kor > 100)
			throw new IllegalArgumentException("유효하지 않은 점수");
		
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//long end = System.currentTimeMillis();
		
		//String message = (end-start)+"ms 시간이 걸렸습니다.";
		//System.out.println(message);
		
		return result;
	}

	@Override
	public float avg() {
		// TODO Auto-generated method stub
		float result = total()/4.0f;
		return result;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
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
	public String toString() {
		return "NewLecExam [kor=" + kor + ", eng=" + eng + ", math=" + math + ", com=" + com + "]";
	}
	
	

}
