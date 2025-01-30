import java.util.Scanner;

public class MainFile extends AddQuestion {
    public static void main(String[] args) {
        // QuestionPrinter.questionlistprint();

        Scanner scanner = new Scanner(System.in);

        // 
        boolean status = true;
        while (status == true) {
        System.out.println("------------Login page----------------");

        // System.out.print("Enter UserName : ");
        // String username = scanner.next();

        // System.out.print("Enter Password : ");
        // String password = scanner.next();

        System.out.println("---------------------------------------");

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

        if(press == 1)  {
            System.out.println("You are in Quiz");
            QuestionPrinter.questionlistprint();
            // quiz.questionquiz();
        }
        else if (press == 2)  {
            System.out.println("You are admin Add your Question");
            AddQuestion.addQuestion();
        }
        else if (press == 3)  {
            System.out.println("Good Bye");
            status = false;
        }
        else {
            System.out.println("Please select correct option !!!");
        }

        System.out.println("Program is End");

        //scanner.close();
        }

        


        
    }
}

