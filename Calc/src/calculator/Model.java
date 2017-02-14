package calculator;

public class Model {

	public long calculate(long number1, long number2, String operator){
		switch(operator){
			case "+":
				return number1 + number2;
			case "-":
				if(number1 == 0)
					return number2;
				return number1 - number2;
			case "*":
				return number1 * number2;
			case "/":
				if (number2 == 0)
					return 0;
				return number1 / number2;
			default:
				System.out.println("Unkown operator" + operator);
		}
		return 0;
	}
}