package model;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface HotelBooking extends Remote {

    User adminLogin(String email, String password) throws RemoteException;

    void adminRegister(User user) throws RemoteException;

    User guestLogin(String email, String password) throws RemoteException;

    void guestRegister(User user) throws RemoteException;

    List<Room> browseRooms() throws RemoteException;

    void updateRoomDescription(Room room) throws RemoteException;

    void updateRoomAvailability(Room room) throws RemoteException;

    void reserveRoom(Room room) throws RemoteException;

    void modifyReservation(Room room) throws RemoteException;

    void cancelReservation(Room room) throws RemoteException;

    void logout() throws RemoteException;
}
