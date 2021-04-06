package banking.frontEnd;


import banking.service.Input_Grabber;

public class UI_Printer implements FrontEndLayer{

    static Input_Grabber iGrab = new Input_Grabber();

    public static void landingPage(){
        System.out.println("Please select from the following actions!");
        System.out.println("[1] Login");
        System.out.println("[2] Register");
        System.out.println("[3] Exit Bank");
    }
    public static void welcome() {

        boolean invalidAnswer = true;

        System.out.println("---------------------------");
        System.out.println("Welcome to Terminal Banking");
        System.out.println("---------------------------");

        while(invalidAnswer){
            landingPage();
            int choice = iGrab.optionInput();

            switch (choice){
                case 1:
                    System.out.println("You Selected Login");
                    invalidAnswer = false;
                    loginPage();
                    break;
                case 2:
                    System.out.println("You Selected Register");
                    invalidAnswer = false;
                    break;
                case 3:
                    System.out.println("Goodbye");
                    invalidAnswer = false;
                    break;
                default: {
                    System.out.println("Invalid option! Please select a valid choice.");
                }
            }
        }
    }
    public static void registrationPage() {
        System.out.println("Please select from the following actions!");
        System.out.println("[1] Login");
        System.out.println("[2] Register");
        System.out.println("[3] Exit Bank");
    }
    public static void loginPage() {
        System.out.println("Please enter your Username and press Enter!");
        String username = iGrab.questionInput();
        System.out.println("Now, enter your Password and press Enter!");
        String password = iGrab.questionInput();
    }


}
