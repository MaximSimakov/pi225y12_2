package lab4;

public abstract class Calculation {
	protected int length;
	protected int width;
	int S;
	
	void setLength(int length){
		this.length=length;
	}
	
	
	void setwidth(int width){
		this.width=width;
	}
	
	
	public int getLength() {
		return length;
	}
	
	public int getwidth() {
		return width;
	}
	
	public void calculate() {
		S = (getLength()*10)* (getwidth()*10);
	}
	
	public Calculation() {
		
	}

}
