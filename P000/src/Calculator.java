
public class Calculator {
	public int add(int a, int b, String message) {
		if(a > 999 || b > 999) {
			message = "Error";
			return 0;
		} else {
			message = "Success";
			return a + b;
		}
	}
	
	
	public int subtract(int a, int b) {
		return a - b;
	}
	
	public int multiple(int a, int b) {
		return a * b;
	}
	
	public int divide(int a, int b) {
		return a / b;
	}

}
