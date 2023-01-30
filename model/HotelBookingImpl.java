package model;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

public class HotelBookingImpl extends UnicastRemoteObject implements HotelBooking {

    public HotelBookingImpl() throws RemoteException {
        super();
    }

    @Override
    public User adminLogin(String email, String password) throws RemoteException {
        // List<User> list = Database.users.stream().filter(x -> x.getEmail() == email && x.getPassword() == password).toList();
        // if(list.size() > 0)
        //     return list.get(0);
        // else 
            return null;
    }

    @Override
    public void adminRegister(User user) throws RemoteException {
        
    }

    @Override
    public User guestLogin(String email, String password) throws RemoteException {
        return null;
    }

    @Override
    public void guestRegister(User user) throws RemoteException {
        
    }

    @Override
    public List<Room> browseRooms() throws RemoteException {
        return null;
    }

    @Override
    public void updateRoomDescription(Room room) throws RemoteException {
        
    }

    @Override
    public void updateRoomAvailability(Room room) throws RemoteException {
        
    }

    @Override
    public void reserveRoom(Room room) throws RemoteException {
        
    }

    @Override
    public void modifyReservation(Room room) throws RemoteException {
        
    }

    @Override
    public void cancelReservation(Room room) throws RemoteException {
        
    }

    @Override
    public void logout() throws RemoteException {
        
    }
}
