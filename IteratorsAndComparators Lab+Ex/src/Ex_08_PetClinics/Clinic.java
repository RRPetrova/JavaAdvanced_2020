package Ex_08_PetClinics;

import java.util.Iterator;

public class Clinic implements Iterable<Pet>{
    private String name;
    private Pet[] rooms;

    public Clinic(String name, int rooms) {
        this.name = name;
        this.setRooms(rooms);
    }

    private void setRooms(int rooms) {
        if (rooms % 2 == 0) {
            throw new IllegalArgumentException("Invalid operation!");
        }
        this.rooms = new Pet[rooms];
    }

    public boolean add(Pet pet) {
        int room = this.rooms.length / 2; //2 1 3 0 4
        for (int i = 0; i < this.rooms.length; i++) {
            if (i % 2 != 0) { //room = 2-1 = 1 ; room = 3 - 3 = 0
                room -= i;
            } else { // room = 2 + 0; room = 1 + 2 = 3; room = 0 +4
                room += i;
            }
            if (this.rooms[room] == null) {
                this.rooms[room] = pet;
                return true;
            }
        }
        return false;
    }


    public boolean release() {
        for (int i = this.rooms.length / 2; i < this.rooms.length; i++) {
            if (this.rooms[i] !=null) {
                this.rooms[i] = null;
                return true;
            }
        }

        for (int i = 0; i < this.rooms.length / 2; i++) {
            if (this.rooms[i] !=null) {
                this.rooms[i] = null;
                return true;
            }
        }
        return false;
    }

    public boolean hasEmptyRooms() {
        for (Pet room : rooms) {
            if (room == null) {
                return true;
            }
        }
        return false;
    }

    public String printRoom(int room) {
            if (this.rooms[room] == null) {
                return "Room empty";
        }
        return this.rooms[room].toString();
    }


    @Override
    public Iterator<Pet> iterator() {
        return new Iterator<Pet>() {

            private int position;
            @Override
            public boolean hasNext() {
                return this.position < rooms.length;
            }

            @Override
            public Pet next() {
                return rooms[this.position++];
            }
        };
    }


}
