package view;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import model.HotelBooking;

public class ModifyReservationView extends UnicastRemoteObject {

    public ModifyReservationView() throws RemoteException {
        super();
    }

    public void modifyReservationView(HotelBooking stub) throws RemoteException {
        
    }
}
