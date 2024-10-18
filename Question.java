package lab7;

/**
 * Program som testar Question och ställer olika frågor som antingen kan få
 * svaret "true" eller "false"
 * 
 * @author 24adsa02 (Adam Sandén)
 * @version 20241016
 */
public class Question {
	private String text;
	private String answer;

	public Question() {
		text = "";
		answer = "";
	}

	/**
	 * Sets the question text.
	 * 
	 * @param questionText the text of this question
	 */
	public void setText(String questionText) {
		// Ta bort bindestreck, whitespaces och byt ut alla whitespaces mellan
		// questionText med en spacebar från questionText
		text = questionText.replaceAll("-", "").trim().replaceAll("\\s+", " ");
	}

	/**
	 * Sets the answer for this question.
	 * 
	 * @param correctResponse the answer
	 */
	public void setAnswer(String correctResponse) {
		// Gör whitespaces till ett space och trimma, ta inte bort bindestreck här
		answer = correctResponse.trim().replaceAll("\\s+", " ");
	}

	/**
	 * Gets the answer string.
	 * 
	 * @return the Answer string
	 */
	public String getAnswer() {
		return answer;
	}

	/**
	 * Checks a given response for correctness.
	 * 
	 * @param response the response to check
	 * @return true if the response was correct, false otherwise
	 */
	public boolean checkAnswer(String response) {
		// Gör whitespaces till ett space och trimma, ta inte bort bindestreck här
		String normalizedResponse = response.trim().replaceAll("\\s+", " ");
		return normalizedResponse.toLowerCase().equals(answer.toLowerCase());
	}

	/**
	 * Returns the question string.
	 */
	public String toString() {
		return text;
	}
}
