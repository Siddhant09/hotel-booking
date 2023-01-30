package view;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import model.HotelBooking;

public class UpdateRoomDescriptionView extends UnicastRemoteObject {

    public UpdateRoomDescriptionView() throws RemoteException {
        super();
    }

    public void updateRoomDescriptionView(HotelBooking stub) throws RemoteException {
        
    }
    
}
