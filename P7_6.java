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
		Question q1 = new Question();

		// Set-a en question text
		q1.setText("Who is the inventor of the World Wide Web?");
		System.out.println("Question: " + q1.toString());

		// Set-a ett korrekt svar
		q1.setAnswer("Tim Berners-Lee");

		// Testa det rätta svaret
		System.out.println("Checking answer 'Tim Berners Lee': " + q1.checkAnswer("Tim Berners-Lee")); // true

		// Testa ett fel svar
		System.out.println("Checking answer 'Steve Jobs': " + q1.checkAnswer("Steve Jobs")); // false

		// Testa ett svar med extra spaces eller skillnader på stor och liten bokstav
		System.out.println("Checking answer ' tim  berners-lee ': " + q1.checkAnswer(" tim  berners-lee ")); // true
	}
}
