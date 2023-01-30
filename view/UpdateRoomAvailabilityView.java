package view;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import model.HotelBooking;

public class UpdateRoomAvailabilityView extends UnicastRemoteObject {

    public UpdateRoomAvailabilityView() throws RemoteException {
        super();
    }

    public void updateRoomAvailabilityView(HotelBooking stub) throws RemoteException {
        
    }
    
}
