package Day9;
/* Composition (House, Room, Furniture) */

class Furniture {

    void showFurniture() {
        System.out.println("Furniture Available");
    }
}

class Room {

    Furniture f = new Furniture();

    void showRoom() {
        System.out.println("Room Created");
        f.showFurniture();
    }
}

class House {

    Room r = new Room();

    void showHouse() {
        System.out.println("House Created");
        r.showRoom();
    }

    public static void main(String[] args) {

        House h = new House();
        h.showHouse();
    }
}
