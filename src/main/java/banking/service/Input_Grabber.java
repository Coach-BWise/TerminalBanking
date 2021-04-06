package banking.service;

import java.util.Scanner;

public class Input_Grabber implements ServiceLayer {
    Scanner sc = new Scanner(System.in);
    public String questionInput(){
        String s = sc.nextLine();
        return s;
    }
    public int optionInput(){
        int choice = Integer.parseInt(sc.nextLine());
        return choice;
    }

    public double amountInput(){
        double amount = Double.parseDouble(sc.nextLine());
        return amount;
    }
}
