package elitesHotel;

import java.util.Scanner;

public class Hotel {
    Scanner input = new Scanner(System.in);
    public void switchMenuUserInput(){
//       int userInput = input.nextInt();
//       switch (userInput){
//           case 1 ->
//           case 2 ->
//       }
    }
    private String[] rooms;


    public Hotel(int numberOfRooms) {
        this.rooms = new String[numberOfRooms];

    }

    public String bookRoom(String user) {
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i] == null) {
                rooms[i] = user;
                break;
            }

        }

        return "room successfully booked !!!";
    }

    public boolean checkOut(int roomNumber) {
        boolean hasCheckOut = false;
        if (rooms[roomNumber - 1] != null) {
            rooms[roomNumber - 1] = null;
            hasCheckOut = true;

        }
        rooms[roomNumber] = null;
        return hasCheckOut;
    }

    public int getRooms() {
        return rooms.length;
    }


    public boolean bookedRooms(int roomNumber) {
        boolean bookRooms = true;
        if (rooms[roomNumber - 2] != null) {
            rooms[roomNumber - 2] = null;

        }

        return bookRooms;
    }

    public int availableRooms() {
        return rooms.length;
    }

    public String roomGuest() {
        String guestName = "";

        for (int a = 0; a < rooms.length; a++) {
            if (rooms[a] != null) {
                guestName = rooms[a];
            }
        }
        return guestName;
    }


    public String allRoomGuest() {
        String guestName = "";

        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i] != null) {
                guestName = rooms[i];

            }
        }
        return guestName;
    }

    public int getOccupiedRoomCount() {
        int count = 0;
        for (int i =0; i < rooms.length; i ++){
            if (rooms[i]!= null){
                count++;
            }
        }
        return count;
    }

    public String[] getAllGuest() {
        return rooms;
    }
}