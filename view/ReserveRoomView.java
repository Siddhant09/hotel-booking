package view;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import model.HotelBooking;

public class ReserveRoomView extends UnicastRemoteObject {

    public ReserveRoomView() throws RemoteException {
        super();
    }

    public void reserveRoomView(HotelBooking stub) throws RemoteException {
        
    }
    
}
