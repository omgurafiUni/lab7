package lab7;

/**
 * Program som testar klassen Question genom att ställa frågor som besvaras
 * utifrån metoderna
 * 
 * @author 24adsa02 (Adam Sandén)
 * @version 20241016
 */
public class NumericQuestion extends Question {
	public NumericQuestion() {
		super();
	}

	@Override
	public void setAnswer(String correctResponse) {
		// I NumericQuestion tar vi inte bort bindrestrecken eftersom negativa nummer är
		// valid
		super.setAnswer(correctResponse.trim());
	}

	@Override
	public boolean checkAnswer(String response) {
		// Hämta correctAnswer OCH userResponse, byt ut alla komma till punkt och ta
		// bort whitespaces
		double correctAnswer = Double.parseDouble(getAnswer().replaceAll(",", ".").trim());
		double userResponse = Double.parseDouble(response.replaceAll(",", ".").trim());

		// Om skillnaden är mindre än 0.01 med floating-point precision, returneras true
		return Math.abs(correctAnswer - userResponse) < 0.010000000000001;
	}
}
