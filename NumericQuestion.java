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
        // In NumericQuestion, we don't remove hyphens since negative numbers are valid
        super.setAnswer(correctResponse.trim());  // Just trim spaces but don't touch hyphens
    }

    @Override
    public boolean checkAnswer(String response) {
        try {
            // Get the correct answer and user response as double
            double correctAnswer = Double.parseDouble(getAnswer().replaceAll(",", ".").trim());
            double userResponse = Double.parseDouble(response.replaceAll(",", ".").trim());
            
            correctAnswer = Math.round(correctAnswer * 100.0) / 100.0;
            userResponse = Math.round(userResponse * 100.0) / 100.0;

            // Check if the difference between the two numbers is within 0.01
            return Math.abs(correctAnswer - userResponse) < 0.01;
        } catch (NumberFormatException e) {
            // If conversion fails, log and return false
            System.out.println("NumberFormatException: " + e.getMessage());
            return false;
        }
    }
}
