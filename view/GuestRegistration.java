package view;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import model.HotelBooking;

public class GuestRegistration extends UnicastRemoteObject {

    public GuestRegistration() throws RemoteException {
        super();
    }

    public void guestRegistration(HotelBooking stub) throws RemoteException {
        
    }
    
}
