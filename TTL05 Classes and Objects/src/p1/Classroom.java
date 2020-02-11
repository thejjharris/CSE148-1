package p1;

public class Classroom {
	private String roomNumber;
	private int numberOfSeats;
	private boolean hasProjector;
	
	public Classroom(String roomNumber, int numberOfSeats, boolean hasProjector) {
		this.roomNumber = roomNumber;
		this.numberOfSeats = numberOfSeats;
		this.hasProjector = hasProjector;
	}
	
	public String getRoomNumber() {
		return roomNumber;
	}
	
	public int getNumberOfSeats() {
		return numberOfSeats;
	}
	
	public boolean getHasProjector() {
		return hasProjector;
	}

	public void setRoomNumber(String newRoomNumber) {
		roomNumber = newRoomNumber;
	}
	
	public void setNumberOfSeats(int newNumberOfSeats) {
		numberOfSeats = newNumberOfSeats;
	}
	
	public void setHasProjector(boolean newHasProjector) {
		hasProjector = newHasProjector;
	}
	
	public String toString()  {
		return "Room Number: " + roomNumber + ", Capacity: " 
				+ numberOfSeats + ", Has Project: " + hasProjector;
	}
}
