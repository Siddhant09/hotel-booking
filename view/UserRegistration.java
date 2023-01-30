package view;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import model.HotelBooking;

public class UserRegistration extends UnicastRemoteObject {

    public UserRegistration() throws RemoteException {
        super();
    }

    public void userRegistration(HotelBooking stub) throws RemoteException {
        
    }
    
}
