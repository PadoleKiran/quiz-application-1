import java.util.Scanner;

public class MainFile{
    public static void main(String[] args) {
        // QuestionPrinter.questionlistprint();
        QuestionPrinter questionprinter = new QuestionPrinter();
        AddQuestion addquestion = new AddQuestion();
        

        Scanner scanner = new Scanner(System.in);

        int numCount = 0;
        // 
        boolean status = true;
        while (status == true) {

        numCount++;
        System.out.println("");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("--------------------------------- Login page -----------------------------------");

        // System.out.print("Enter UserName : ");
        // String username = scanner.next();

        // System.out.print("Enter Password : ");
        // String password = scanner.next();

        System.out.println("--------------------------------------------------------------------------------");

        System.out.println(" For Quiz press = 1 \n For Add question press = 2 \n For exit press = 3");
        System.out.print("Enter your choice : ");
        int press = scanner.nextInt();

        // if(username.toLowerCase().equals("user") && password.toLowerCase().equals("user123") ) {
        //     System.out.println("You are loged in as user");
        //     QuestionPrinter.questionlistprint();
        //     // quiz.questionquiz();
        // }
        // else if (username.toLowerCase().equals("admin") && password.toLowerCase().equals("admin123") ) {
        //     System.out.println("You are loged in as Admin");
        //     AddQuestion.addQuestion();
        // }
        // else {
        //     System.out.println("Please Enter valid Id and Password");
        // }

        switch(press){
            case 1: 
                System.out.println("You are in Quiz");
                questionprinter.questionlistprint();
                // quiz.questionquiz();
                break;
            case 2:
                System.out.println("You are admin Add your Question");
                addquestion.addQuestion();
                break;
            case 3: 
                System.out.println("Good Bye");
                status = false;
                break;
            default : 
                System.out.println("Please select correct option !!!");
                break;
        }


        // if(press == 1)  {
        //     System.out.println("You are in Quiz");
        //     QuestionPrinter.questionlistprint();
        //     // quiz.questionquiz();
        // }
        // else if (press == 2)  {
        //     System.out.println("You are admin Add your Question");
        //     AddQuestion.addQuestion();
        // }
        // else if (press == 3)  {
        //     System.out.println("Good Bye");
        //     status = false;
        // }
        // else {
        //     System.out.println("Please select correct option !!!");
        // }

        System.out.println("Program is End");

        //scanner.close();
        }

    }
}

