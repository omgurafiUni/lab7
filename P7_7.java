package lab7;

/**
 * Program som testar NumericQuestion som hanterar numeriska svar genom att
 * jämföra det korrekta svaret och användarens svar som flyttal med en "margin"
 * på 0,01.
 * 
 * @author 24adsa02 (Adam Sandén)
 * @version 20241016
 */
public class P7_7 {
	public static void main(String[] args) {
		NumericQuestion numQ = new NumericQuestion();
		numQ.setAnswer("-3.14");

		// Test negative number comparison
		System.out.println(numQ.checkAnswer("-3.14")); // Should return true
		System.out.println(numQ.checkAnswer("-3.15")); // Should return true (within 0.01 tolerance)
		System.out.println(numQ.checkAnswer("-3.13")); // Should return true (within 0.01 tolerance)
		System.out.println(numQ.checkAnswer("-3.12")); // Should return false (outside tolerance)
	}
}
