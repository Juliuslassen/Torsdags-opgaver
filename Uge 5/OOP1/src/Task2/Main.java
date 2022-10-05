package Task2;

import java.util.ArrayList;


public class Main {

    public static ArrayList<Room> rooms = new ArrayList<>();

    public static void main(String[] args) {
        Room jacksroom = new Room(3, 17, 5);
        Room room2 = new Room(1, 3, 2);
        Room oliprison = new Room(1, 1, 1);

        rooms.add(jacksroom);
        rooms.add(room2);
        rooms.add(oliprison);

        Building roundTower = new Building(rooms, 15, 17, false);

        System.out.println(countLampsInBuilding(roundTower));

        System.out.println(isNormal(roundTower));

    }

    public static int countLampsInBuilding(Building building) {
        int totalLamps = 0;
        for (int i = 0; i < rooms.size(); i++) {
            totalLamps += rooms.get(i).getNumberOfLamps();
        }
        return totalLamps;

    }

    public static boolean isNormal(Building building){
        int totalFloors= building.getNumberOfFloors();
        int totalRooms= rooms.size() + building.getNumberOfBathrooms();

        if(totalRooms<totalFloors) {
            return true;
        }
        else {
            System.out.println("This is and odd building");
            return false;
        }
    }

}
