package view;

import java.rmi.RemoteException;
import java.util.Scanner;
import java.rmi.server.UnicastRemoteObject;

import model.HotelBooking;
import model.User;

public class UserLoginView extends UnicastRemoteObject {

    public UserLoginView() throws RemoteException {
        super();
    }

    public User userLoginView(HotelBooking stub) throws RemoteException {
        User user = new User();
        try(Scanner scanner = new Scanner(System.in)) {

            System.out.println("Enter user ID");
            String email = scanner.nextLine();

            System.out.println("Enter password");
            String password = scanner.nextLine();

            user = stub.adminLogin(email, password);
            if(user == null || user.getName() == null) {
                System.out.println("Invalid credentials");
            } else {
                System.out.println("Current Session");
                System.out.println("Name: " + user.getName());
                System.out.println("Email: " + user.getEmail());
                System.out.println("Role: " + user.getRole());
            }

        }catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
            ex.printStackTrace();
        }
        return user;
    }
}
