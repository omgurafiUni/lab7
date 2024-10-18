package lab7;

/**
 * Program som testar NumericQuestion, som hanterar numeriska svar genom att
 * jämföra det korrekta svaret med användarens svar med en "margin" på 0,01. Vi
 * använder oss av doubles.
 * 
 * @author 24adsa02 (Adam Sandén)
 * @version 20241016
 */
public class P7_7 {
	public static void main(String[] args) {
		NumericQuestion numQ = new NumericQuestion();
		numQ.setAnswer("-3.14"); // Testa att set-a ett negativt nummer som svar

		// Checka svar som är negativa, innanför och utanför margin
		System.out.println(numQ.checkAnswer("-3.14")); // true
		System.out.println(numQ.checkAnswer("-3.15")); // true (inom 0.01 margin)
		System.out.println(numQ.checkAnswer("-3.13")); // true (inom 0.01 margin)
		System.out.println(numQ.checkAnswer("-3.12")); // false (utanför margin)
	}
}
