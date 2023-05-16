
public class FinalKeyWord {
	
	final  int  data;
	
	static FinalKeyWord gf;
	
	public FinalKeyWord() {
		data=1;
	}
	
	public static void m1() {
		System.out.println(gf.data);
	}
	
	public static void main(String args[]) {
		FinalKeyWord.m1();
	}
	

}
