import java.util.Scanner;

public class AddQuestion extends QuestionPrinter {
    // addQuestion(new String[]{"4", "What is the largest mammal?", "Elephant", "Whale", "Shark", "Giraffe", "Whale"});
        
    //     // Printing all questions
    //     for (String[] q : getQuestions()) {
    //         System.out.println(q[1]); // Print question text

    static void addQuestion() { 
    Scanner scanner = new Scanner(System.in);

        System.out.println("--------------------------------------------------------------------------------");
        System.out.print("Enter Your quesstion : ");
        String question = scanner.nextLine();

        System.out.print("Enter option1 : ");
        String option1 = scanner.nextLine();

        System.out.print("Enter option2 : ");
        String option2 = scanner.nextLine();

        System.out.print("Enter option3 : ");
        String option3 = scanner.nextLine();

        System.out.print("Enter option4 : ");
        String option4 = scanner.nextLine();

        System.out.print("Enter correct option : ");
        String correctOption = scanner.nextLine();

        String count =String.valueOf(questionCount + 1); 
        System.out.println("--------------------------------------------------------------------------------");

        QuestionsList.addNewQuestion(new String[]{count, question, option1, option2, option3, option4, correctOption});
        
        // Printing all questions
        // for (String[] q : getQuestions()) {
        //     System.out.println(q[1]); // Print question text
        // }
        // scanner.close();
    }
}
