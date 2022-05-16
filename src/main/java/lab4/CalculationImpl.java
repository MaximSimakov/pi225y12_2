package lab4;
import lab4.Calc;
import lab4.Calc.RequestCalc;
//calc
public class CalculationImpl extends Calculation {
	
	//private String first_calc;
	//private String second_calc;
	//public int S;
	
	//RequestCalc calc=new RequestCalc(first_calc, second_calc);
	//RequestCalc cal = new RequestCalc();
	//alc cal = new Calc();
	//int a1=calc.getFirstCalc();
	//int b1=calc.getSecondCalc();
	
	//Integer first_cal = a1;
	//Integer second_cal = b1;
	
	
//	public void setLength(String lenght){
//		length = first_calc;
//	}
//	
//	public void setwidth(){
//		width = this.second_calc;
//	}
//	
//	public int getLength() {
//		return length;
//	}
//	
//	public int getwidth() {
//		return width;
//	}
	
	
	public CalculationImpl(int a, int b) {
		setLength(a);
		setwidth(b);
		calculate();
	}
	public int getS() {
		return super.S;
	}
	
	
	
}
