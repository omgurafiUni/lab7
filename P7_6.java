package lab7;

/**
 * Program som testar klassen Question genom att ställa frågor som besvaras
 * utifrån metoderna
 * 
 * @author 24adsa02 (Adam Sandén)
 * @version 20241016
 */
public class P7_6 {
	public static void main(String[] args) {
		// Create a new question instance
		Question q1 = new Question();

		// Set a question text
		q1.setText("Who is the inventor of the World Wide Web?");
		System.out.println("Question: " + q1.toString());

		// Set the correct answer
		q1.setAnswer("Tim Berners-Lee");

		// Test with the correct answer
		System.out.println("Checking answer 'Tim Berners Lee': " + q1.checkAnswer("Tim Berners-Lee")); // Should print
																										// true

		// Test with an incorrect answer
		System.out.println("Checking answer 'Steve Jobs': " + q1.checkAnswer("Steve Jobs")); // Should print false

		// Test with answer having extra spaces or case differences
		System.out.println("Checking answer ' tim  berners-lee ': " + q1.checkAnswer(" tim  berners-lee ")); // Should
																												// print
																												// true
	}
}
