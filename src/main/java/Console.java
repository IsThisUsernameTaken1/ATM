import java.util.Scanner;

<<<<<<< HEAD
public class Console extends Accounts {
=======
>>>>>>> feaffc142f4c360c783bd2eb61881c35b86a04d7

public class Console {
    public static void main(String[] args) {


        bootUpATM();

    }

    public static void bootUpATM() {
        System.out.println("What do you want to do?");
        System.out.printf("%5s-%5s\n", "1 ", " Log in to existing account.");
        System.out.printf("%5s-%5s\n", "2 ", " Create a new account.");
        System.out.print(": ");
        Scanner atmScanner = new Scanner(System.in);
        int inputOnHomeScreen = atmScanner.nextInt();
        if (inputOnHomeScreen == 1) {
            logIntoExistingAccount();
        }
        if (inputOnHomeScreen == 2) {
<<<<<<< HEAD
            createNewAccount();
            
        }
=======
            //createNewAccount();

            System.out.println("Caesar eats poop");
        }   
>>>>>>> feaffc142f4c360c783bd2eb61881c35b86a04d7
    }



}
