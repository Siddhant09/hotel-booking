package model;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Date;

public class Booking extends UnicastRemoteObject {

    public Booking() throws RemoteException {
        super();
    }
    public Booking(String roomNo, String userName, Date fromDate, Date toDate, boolean isCancelled) throws RemoteException {
        this.roomNo = roomNo;
        this.userName = userName;
        this.fromDate = fromDate;
        this.toDate = toDate;
        this.isCancelled = isCancelled;
    }

    private String roomNo;
    private String userName;
    private Date fromDate;
    private Date toDate;
    private boolean isCancelled;

    public String getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(String roomNo) {
        this.roomNo = roomNo;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    public Date getToDate() {
        return toDate;
    }

    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }

    public boolean isCancelled() {
        return isCancelled;
    }

    public void setCancelled(boolean isCancelled) {
        this.isCancelled = isCancelled;
    }
    
}
