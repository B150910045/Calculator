
public class Calculator {
	
	public double add(double a, double b) {
		return a + b;
	}
	
	public double sub(double a, double b) {
		return a - b;
	}
	
	public double divide(double a, double b) {
		return a / b;
	}

	public double multiply(double a, double b) {
		return a * b;
	}

	public double remainder(double a, double b) {
		return a % b;
	}

	public double power(double a, double b) {
		return Math.pow(a, b);
	}
	
	public double plusOrMinus(double a) {
		return a*(-1);
	}
	
	public double equal(double num1, double num2, String temdeg) {
		double result;
		switch(temdeg) {
		case "+":
			result = add(num1, num2);
			break;
		case "-":
			result = sub(num1, num2);
			break;
		case "*":
			result = multiply(num1, num2);
			break;
		case "/":
			result = divide(num1, num2);
			break;
		case "%":
			result = remainder(num1, num2);
			break;
		case "^":
			result = power(num1, num2);
			break;
		default:
			result = 0;
			break;
		}
		return result;
	}

}
