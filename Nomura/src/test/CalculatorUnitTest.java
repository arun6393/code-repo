package test;

public class CalculatorUnitTest {	
	
	
	public void CUT_01_divide_by_0() {
		Calculator calculator=new Calculator();
	//	 calculator.divide(1, 0);
		
	}
	
	
	
	public void CTU_01_success() {
	int result=calculator.divide(1, 1);
		assertVerify(result,1);
	}
	
	
	
	
	
}
