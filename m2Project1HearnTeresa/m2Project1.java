import javax.swing.JOptionPane;

public class m2Project1 {
    public static void main(String[] args) {
        // Get number of grades from user
        int numGrades = getNumberOfGrades();
        if (numGrades == -1) return; // User cancelled
        
        // Collect all grades from user
        double totalSum = collectGrades(numGrades);
        if (totalSum == -1) return; // User cancelled
        
        // Calculate average
        double average = calculateAverage(totalSum, numGrades);
        
        // Determine letter grade
        char letterGrade = getLetterGrade(average);
        
        // Display results
        displayResults(numGrades, average, letterGrade);
    }
    
    /**
     * Gets the number of grades the user wants to enter
     * @return number of grades, or -1 if cancelled/invalid
     */
    private static int getNumberOfGrades() {
        while (true) {
            String numGradesStr = JOptionPane.showInputDialog(
                null, 
                "How many grades would you like to enter?", 
                "Grade Calculator", 
                JOptionPane.QUESTION_MESSAGE
            );
            
            // Check if user cancelled
            if (numGradesStr == null) {
                JOptionPane.showMessageDialog(null, "Program cancelled.");
                return -1;
            }
            
            // Check for empty input
            if (numGradesStr.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please enter a number. Try again.");
            } else {
                try {
                    int numGrades = Integer.parseInt(numGradesStr);
                    if (numGrades <= 0) {
                        JOptionPane.showMessageDialog(null, "Please enter a positive number of grades. Try again.");
                    } else {
                        return numGrades; // Valid input, return the number
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid number. Try again.");
                }
            }
        }
    }
    
    /**
     * Collects grades from the user
     * @param numGrades number of grades to collect
     * @return sum of all grades, or -1 if cancelled
     */
     private static double collectGrades(int numGrades) {
        double sum = 0;
        
        for (int i = 0; i < numGrades; i++) {
            boolean validGrade = false;
            
            while (!validGrade) {
                String gradeStr = JOptionPane.showInputDialog(
                    null, 
                    "Enter grade " + (i + 1) + ":", 
                    "Grade Entry", 
                    JOptionPane.QUESTION_MESSAGE
                );
                
                // Check if user cancelled
                if (gradeStr == null) {
                    JOptionPane.showMessageDialog(null, "Program cancelled.");
                    return -1;
                }
                
                // Check for empty input
                if (gradeStr.trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please enter a grade. Try again.");
                } else {
                    try {
                        double grade = Double.parseDouble(gradeStr);
                        if (grade < 0 || grade > 100) {
                            JOptionPane.showMessageDialog(null, "Please enter a grade between 0 and 100. Try again.");
                        } else {
                            // Valid grade - add to sum and move to next grade
                            sum += grade;
                            validGrade = true;
                        }
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid number. Try again.");
                    }
                }
            }
        }
        
        return sum;
    }
    
    /**
     * Calculates the average of grades
     * @param sum total sum of all grades
     * @param count number of grades
     * @return average grade
     */
    private static double calculateAverage(double sum, int count) {
        return sum / count;
    }
    
    /**
     * Determines letter grade based on numeric average
     * @param average numeric average
     * @return letter grade (A, B, C, D, or F)
     */
    private static char getLetterGrade(double average) {
        if (average >= 90) {
            return 'A';
        } else if (average >= 80) {
            return 'B';
        } else if (average >= 70) {
            return 'C';
        } else if (average >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
    
    /**
     * Displays the final results to the user
     * @param numGrades number of grades entered
     * @param average calculated average
     * @param letterGrade calculated letter grade
     */
    private static void displayResults(int numGrades, double average, char letterGrade) {
        StringBuilder result = new StringBuilder();
        result.append("Results:\n\n")
              .append("Number of grades entered: ").append(numGrades).append("\n")
              .append("Average grade: ").append(String.format("%.2f", average)).append("\n")
              .append("Letter grade: ").append(letterGrade).append("\n\n")
              .append("Grade Scale:\n")
              .append("A: 90-100\n")
              .append("B: 80-89\n")
              .append("C: 70-79\n")
              .append("D: 60-69\n")
              .append("F: Below 60");
        
        JOptionPane.showMessageDialog(
            null, 
            result.toString(), 
            "Grade Calculator Results", 
            JOptionPane.INFORMATION_MESSAGE
        );
    }
}
