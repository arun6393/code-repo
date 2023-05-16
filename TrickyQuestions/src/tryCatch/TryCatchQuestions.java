package tryCatch;

public class TryCatchQuestions {
	
	public static void main(String args[]) {
	
		TryCatchQuestions catchQuestions=new TryCatchQuestions();
		System.out.println(catchQuestions.m1());
		System.out.println(catchQuestions.m2());
	}
	
	public int m1() {
		try {
			return 1;
		}finally {
			return 10;
		}
	}
	
	public int m2() {
		try {
			m3();
			return 3;
		} catch (Exception e) {
			return 2;
		}finally {
			return 5;
		}
	}
	
	public void m3() throws Exception {
		throw new Exception();
	}

}
