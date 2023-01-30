package controller;

import model.Database;
import model.HotelBooking;
import model.Menu;
import view.UserLoginView;

import java.rmi.Naming;
import java.util.Scanner;

public class ClientController {

    //private field to store user choise for menu
    private static int choise;

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            //looking for the stub with the name given in server
            HotelBooking stub = (HotelBooking) Naming.lookup("localhost");
            System.out.println("Client started");
            
            Menu menu = new Menu();
            Database.createData();
            UserLoginView userLoginView = new UserLoginView();
            //cleaing the console
            menu.clearScreen();
            
            boolean iscontinue = true;
            while (iscontinue) {
                //displaying the menu
                menu.displayMainMenu();
                
                //checking of the input is valid
                while (!scanner.hasNextInt()) {
                    System.out.println("Invalid input, please select a valid option");
                    scanner.next();
                    continue;
                }
                choise = scanner.nextInt();

                //performing actions based on user choise
                switch (choise) {
                    case 1:
                        userLoginView.userLoginView(stub);
                        iscontinue = false;
                        break;
                    case 2:
                        userLoginView.userLoginView(stub);
                        iscontinue = false;
                        break;
                    default:
                        menu.clearScreen();
                        System.out.println("Invalid input, please select a valid option");
                        break;
                }
            }
        }
        catch (Exception ex) {
            System.out.println("Client error: " + ex.getMessage());
            ex.printStackTrace();
        }
    }
}
