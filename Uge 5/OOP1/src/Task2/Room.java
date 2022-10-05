package Task2;

public class Room {
    private int numberOfDoors;
    private int numberOfLamps;
    private int numberOfWindos;

    public Room(int numberOfDoors, int numberOfLamps, int numberOfWindos){
        this.numberOfDoors=numberOfDoors;
        this.numberOfLamps=numberOfLamps;
        this.numberOfWindos=numberOfWindos;

    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public void setNumberOfLamps(int numberOfLamps) {
        this.numberOfLamps = numberOfLamps;
    }

    public void setNumberOfWindos(int numberOfWindos) {
        this.numberOfWindos = numberOfWindos;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public int getNumberOfLamps() {
        return numberOfLamps;
    }

    public int getNumberOfWindos() {
        return numberOfWindos;
    }



}
