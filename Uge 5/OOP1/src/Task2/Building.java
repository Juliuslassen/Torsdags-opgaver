package Task2;

import java.util.ArrayList;

public class Building {

    private final ArrayList<Room> rooms = new ArrayList<>();
    private int numberOfBathrooms;
    private int numberOfFloors;
    private boolean isOfficeBuilding;

    public Building(ArrayList<Room> rooms,int numberOfBathrooms, int numberOfFloors, boolean isOfficeBuilding){
        //this.rooms=rooms;
        this.numberOfBathrooms=numberOfBathrooms;
        this.numberOfFloors=numberOfFloors;
        this.isOfficeBuilding=isOfficeBuilding;
    }

    public void setNumberOfBathrooms(int numberOfBathrooms) {
        this.numberOfBathrooms = numberOfBathrooms;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public void setOfficeBuilding(boolean officeBuilding) {
        isOfficeBuilding = officeBuilding;
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public int getNumberOfBathrooms() {
        return numberOfBathrooms;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public boolean isOfficeBuilding() {
        return isOfficeBuilding;
    }
}
