package example;

public class Calculator {
	private int[] arguments;
	
	public void setArguments(int... args){
		this.arguments = args;
	}
	
	public int getSum(){
		int sum = 0;
		
		for(int arg : arguments){
			sum += arg;
		}
		
		return sum;
	}
}
