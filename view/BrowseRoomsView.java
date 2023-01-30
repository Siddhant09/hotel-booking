package view;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

import model.HotelBooking;
import model.Room;

public class BrowseRoomsView extends UnicastRemoteObject {

    public BrowseRoomsView() throws RemoteException {
        super();
    }

    public List<Room> browseRoomsView(HotelBooking stub) throws RemoteException {
        return null;
    }
    
}
