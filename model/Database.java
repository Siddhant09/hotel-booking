package model;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Database extends UnicastRemoteObject {
    
    public static List<User> users = new ArrayList<User>();
    public static List<Room> rooms = new ArrayList<Room>();
    public static List<Booking> bookings = new ArrayList<Booking>();

    public Database() throws RemoteException {
        super();
    }

    public static void createData() throws RemoteException {
        try {
            
            User admin = new User();
            admin.setName("Super Admin");
            admin.setEmail("admin@grandhotel.com");
            admin.setPassword("Admin@123");
            admin.setRole("Admin");
            users.add(admin);
            
            User admin2 = new User();
            admin2.setName("John");
            admin2.setEmail("john@grandhotel.com");
            admin2.setPassword("John@123");
            admin2.setRole("Admin");
            users.add(admin2);
            
            Guest guest1 = new Guest();
            guest1.setName("Emma");
            guest1.setEmail("emma@gmail.com");
            guest1.setPassword("Emma@123");
            guest1.setRole("Guest");
            users.add(guest1);
            
            Guest guest2 = new Guest();
            guest2.setName("Adam");
            guest2.setEmail("adam@gmail.com");
            guest2.setPassword("Adam@123");
            guest2.setRole("Guest");
            users.add(guest2);

            rooms.add(new Room("101", "Single", "Single room, smoking is not allowed", 25f, 3f, 1, "Single Bed", false, true));
            rooms.add(new Room("102", "Twin", "Single room, smoking is allowed", 30f, 3f, 2, "Single Bed", true, true));
            rooms.add(new Room("201", "Double", "Single room, smoking is not allowed", 35f, 4f, 1, "Double Bed", false, true));
            rooms.add(new Room("202", "Double", "Single room, smoking is allowed", 40f, 4f, 1, "Double Bed", true, false));
            rooms.add(new Room("301", "Pent House", "Pent house, without view, smoking is allowed", 45f, 4.5f, 1, "Queen Bed", true, true));
            rooms.add(new Room("302", "Pent House", "Pent house, with amazing view, smoking is allowed", 50f, 5f, 1, "King Bed", true, true));

            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            Date from = df.parse("2022-04-01");
            Date to = df.parse("2022-04-10");

            bookings.add(new Booking("202", "Emma", from, to, true));
            
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
