import java.util.Scanner;

public class QuestionPrinter extends QuestionsList{

    static void questionlistprint() {
        String[][] questions = QuestionsList.getQuestions(); // Get the questions from the QuestionsList class
        Scanner scanner = new Scanner(System.in);
        int correctanswercount = 0;
        int totalquestions = 0;

        
        for (int i = 0; i < questions.length; i++) {
            
            String[] question = questions[i];

            System.out.println("--------------------------------------------------------------------------------");
            // question number
            System.out.println("Question Number: " + question[0]);
            // quection
            System.out.println(question[1]);

            // options
            System.out.println("1. " + question[2]);
            System.out.println("2. " + question[3]);
            System.out.println("3. " + question[4]);
            System.out.println("4. " + question[5]);

            System.out.println("--------------------------------------------------------------------------------");
            // Ask answer
            System.out.print("Enter your answer (1/2/3/4): ");
            int userAnswerIndex = scanner.nextInt();

            System.out.println("--------------------------------------------------------------------------------");
            
            // Check if the answer is correct
            String correctAnswer = question[6];
            String userAnswer = question[userAnswerIndex + 1]; // Match user input to option

            if (userAnswer.equals(correctAnswer)) {
                System.out.println("Correct answer!");
                correctanswercount++;
            } else {
                System.out.println("Incorrect! The correct answer is: " + correctAnswer);
            }

            totalquestions++;
            System.out.println(); // blank line between questions
        }

        double percent = (((double)correctanswercount/totalquestions) * 100);
        System.out.println("Number of questions : " + totalquestions); 
        System.out.println("Correct answers : " + correctanswercount); 
        System.out.println("You got percent : " + percent); 

        if (percent >= 0.0 && percent <= 30.0 ) {
            System.out.println("You must study harder.");
        }
        else if (percent >= 31.0 && percent <= 60.0 ) {
            System.out.println("You are studying good.");
        }
        else if (percent >= 61.0 && percent <= 90.0 ) {
            System.out.println("You are becoming toper and just bit of effords little required.");
        }
        else if (percent >= 91.0 && percent <= 100.0 ) {
            System.out.println("You are very good at concepts and being into top list.");
        }
        System.out.println("--------------------------------------------------------------------------------");
        // scanner.close();
    }

    
}
