package controller;

import model.HotelBooking;
import model.HotelBookingImpl;

import java.rmi.Naming;

public class ServerController {

    public static void main(String[] args) {
        try {
            HotelBooking stub = new HotelBookingImpl();

            //binding the name of the stub
            Naming.rebind("localhost", stub);

            System.out.println("Grand Hotel Server Started");
        }
        catch(Exception ex) {
            System.out.println("Server error: " + ex.getMessage());
            ex.printStackTrace();
        }
    }
}
