package model;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Room extends UnicastRemoteObject {

    protected Room() throws RemoteException {
        super();
    }  

    public Room(String roomNo, String type, String description, float price, float rating, int noOfBeds,
            String typeOfBed, boolean isSmokingAllowed, boolean isAvailable) throws RemoteException {
        this.roomNo = roomNo;
        this.type = type;
        this.description = description;
        this.price = price;
        this.rating = rating;
        this.noOfBeds = noOfBeds;
        this.typeOfBed = typeOfBed;
        this.isSmokingAllowed = isSmokingAllowed;
        this.isAvailable = isAvailable;
    }

    private String roomNo;
    private String type;
    private String description;
    private float price;
    private float rating;
    private int noOfBeds;
    private String typeOfBed;
    private boolean isSmokingAllowed;
    private boolean isAvailable;  

    public String getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(String roomNo) {
        this.roomNo = roomNo;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public int getNoOfBeds() {
        return noOfBeds;
    }

    public void setNoOfBeds(int noOfBeds) {
        this.noOfBeds = noOfBeds;
    }

    public String getTypeOfBed() {
        return typeOfBed;
    }

    public void setTypeOfBed(String typeOfBed) {
        this.typeOfBed = typeOfBed;
    }

    public boolean isSmokingAllowed() {
        return isSmokingAllowed;
    }

    public void setSmokingAllowed(boolean isSmokingAllowed) {
        this.isSmokingAllowed = isSmokingAllowed;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

}
