public class QuestionsList {
    
    public static String[][] questions = {
        {"1", "What is the capital of France?", "Paris", "London", "Berlin", "Madrid", "Paris"},
        {"2", "What is 2 + 2?", "3", "4", "5", "6", "4"},
        {"3", "Which planet is known as the Red Planet?", "Earth", "Venus", "Mars", "Jupiter", "Mars"}
    };

    public static int questionCount(){
        return questions.length;
    }

    
    public static void addNewQuestion(String[] newQuestion) {
        String[][] newQuestionsArray = new String[questions.length + 1][];
        
        for(int i=0; i<questions.length; i++){
            newQuestionsArray[i] = questions[i];
        }

        newQuestionsArray[questions.length] = newQuestion;

        questions = newQuestionsArray;
    }

    public static String[][] getQuestions() {
        return questions;
    }


}
 

