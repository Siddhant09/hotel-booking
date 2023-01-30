package model;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Menu extends UnicastRemoteObject {

    //creating a constructor
    public Menu() throws RemoteException {
        super();
    }    

    //method for displaying welcome message
    public void displayMainMenu() throws RemoteException {
        try {
            System.out.println("===================================");
            System.out.println("Connected to The Grand Hotel Server");
            System.out.println("===================================");
            System.out.println();
            System.out.println("Please select an option");
            System.out.println("1. Admin Login");
            System.out.println("2. Guest Login");
        } catch (Exception ex) {
            System.out.println("Server error: " + ex.getMessage());
            ex.printStackTrace();
        }
    }  

    //method for displaying the menu options
    public void displayLoginMenu() throws RemoteException {
        try {
            System.out.println("-----------------------------------");
            System.out.println("What would you like to do next?");
            System.out.println("1. Check your account balance");
            System.out.println("2. Withdraw money from your account");
            System.out.println("3. Deposit money into your account");
            System.out.println("4. Exit");
            System.out.println("-----------------------------------");
            
        } catch (Exception ex) {
            System.out.println("Server error: " + ex.getMessage());
            ex.printStackTrace();
        }
    }

    //method for clearing the console
    public void clearScreen() throws RemoteException {
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }    
}
