package view;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import model.HotelBooking;
import model.User;

public class GuestLoginView extends UnicastRemoteObject {

    public GuestLoginView() throws RemoteException {
        super();
    }

    public User guestLoginView(HotelBooking stub) throws RemoteException {
        return null;
    }    
}
