JAVA = java
JFLAGS = -g
JC = javac
.SUFFIXES: .java .class
.java.class:
	$(JC) $(JFLAGS) $*.java

CLASSES = \
controller/ClientController.java\
controller/ServerController.java\
model/HotelBooking.java\
model/HotelBookingImpl.java\
model/User.java\
model/Guest.java\
model/Room.java\
model/Booking.java\
model/Database.java\
model/Menu.java\
view/BrowseRoomsView.java\
view/CancelReservationView.java\
view/GuestLoginView.java\
view/GuestRegistration.java\
view/ModifyReservationView.java\
view/ReserveRoomView.java\
view/UpdateRoomAvailabilityView.java\
view/UpdateRoomDescriptionView.java\
view/UserLoginView.java\
view/UserRegistration.java\

default: classes

classes: $(CLASSES:.java=.class)

clean:
	$(RM) */*.class

serverController:
	$(JAVA) controller.ServerController

clientController:
	$(JAVA) controller.ClientController