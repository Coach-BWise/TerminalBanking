package banking;

import banking.frontEnd.UI_Printer;
import banking.service.Input_Grabber;

import java.util.Arrays;
import java.util.Scanner;

public class Main_Driver {

    public static void main(String[] args) {
        // Declare the object and initialize with
        // predefined standard input object
        UI_Printer ui_printer = new UI_Printer();
        ui_printer.welcome();
    }
}
