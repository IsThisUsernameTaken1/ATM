import java.util.ArrayList;
import java.util.Scanner;

public class UserFunctions {

    static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Users> usersWithAccounts = new ArrayList<>();

    public static void logIntoExistingAccount() {
        System.out.println("Please enter your Username: ");
        String username = scanner.nextLine();
        System.out.println("Username: " + username);
        if (username.equals(usersWithAccounts.contains(username))) {
            System.out.println("Please enter your password: ");
        } else if (username.equals(usersWithAccounts.contains(username) == false)){
            System.out.println("error");
            }
        String password = scanner.nextLine();
            if (password.equals(usersWithAccounts.contains(password)))
            {
                System.out.println("Welcome back " + username + ". What would you like to do?");
            }
            else {
                System.out.println("error.");
            }
        }


    public static void createNewAccount() {
        System.out.println("Please create a Username");
        String username = scanner.nextLine();
        //System.out.println("Your username is : " + username);

        System.out.println("Please create a new password: ");
        String password = scanner.nextLine();
        System.out.println("Password: " + password);
        System.out.println("Please re-enter your new password to confirm.");
        String confirmPass = scanner.nextLine();

        int count = 0;

//create while loop, set loop continuation condition to count < 3
        while (count < 1) {

            if ((!confirmPass.equals(password))) {
                System.out.println("Sorry passwords do not match. Try again.");
                confirmPass = scanner.nextLine();
            } else {
                System.out.println("Congrats you've successfully made a new Account.");
                Users users = new Users(username, password);
                usersWithAccounts.add(users);
                count++;


                break;
            }

        }

    }
    public static Savings makeAccountSavingsAccount(Users users) {
        for(int i =0;i<usersWithAccounts.size();i++)
            if(usersWithAccounts.contains(users)){
                logIntoExistingAccount();
                System.out.println("How much do you want to deposit into account?: ");
                Scanner userInputer = new Scanner(System.in);
                double initialDeposit =  userInputer.nextDouble();
                users.
                usersWithAccounts.add(new Savings(initialDeposit));

            }else {
                createNewAccount();
                System.out.println("How much do you want to deposit into account?: ");
                Scanner userInputer = new Scanner(System.in);
                double initialDeposit =  userInputer.nextDouble();
                return new Savings(initialDeposit);
            }

        System.out.println("How much do you want to deposit into account?: ");
            Scanner userInputer = new Scanner(System.in);
          double initialDeposit =  userInputer.nextDouble();
            return new Savings(initialDeposit);
    }
    public static Investment makeAccountInvestmentaccount(Users users){
        for(int i =0;i>usersWithAccounts.size();i++){
            if(usersWithAccounts.contains(users)){
                logIntoExistingAccount();
                System.out.println("How much do you want to deposit into account?: ");
                Scanner userInput = new Scanner(System.in);
                double initialDeposit = userInput.nextDouble();
                return new Investment(initialDeposit);
            }else System.out.println("How much do you want to deposit into account?: ");
            Scanner userInput = new Scanner(System.in);
            double initialDeposit = userInput.nextDouble();
            return new Investment(initialDeposit);

        }return null;
    }
    public static Checking makeAccountCheckingAccount(Users users) {
        for (int i = 0; i < usersWithAccounts.size(); i++) {

            if (usersWithAccounts.contains(users)) {

                logIntoExistingAccount();
                System.out.println("How much do you want to deposit into account?: ");
                Scanner userInput = new Scanner(System.in);
                double initialDeposit = userInput.nextDouble();
                return new Checking(initialDeposit);
            } else System.out.println("How much do you want to deposit into account?: ");
            Scanner userInput = new Scanner(System.in);
            double initialDeposit = userInput.nextDouble();
            return new Checking(initialDeposit);
        }return null;
    }





//public static Investment makeAccountInvestmentAccount(Users newUser,){
//    System.out.println("How much do you want to deposit?");
//            Scanner userInput = new Scanner(System.in);
//
//}

        }


//        if (password.equals(confirmPass)) {
//            System.out.println("Thank you for confirming. Your new Password: " + confirmPass);
//        } else {
//            while (password.equals(confirmPass) == false) {
//
//            }
//            System.out.println("Error. Passwords do not match. Please try again.");
//            // call the method to put in a password again
//        }
