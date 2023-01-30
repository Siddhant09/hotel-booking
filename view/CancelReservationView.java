package view;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import model.HotelBooking;

public class CancelReservationView extends UnicastRemoteObject {

    public CancelReservationView() throws RemoteException {
        super();
    }

    public void cancelReservationView(HotelBooking stub) throws RemoteException {
        
    }
}
