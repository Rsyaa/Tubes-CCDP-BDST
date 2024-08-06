import java.util.ArrayList;
import java.util.List;

class Area implements Reservable {
    private String name;
    private List<Reservable> reservables;

    public Area(String name) {
        this.name = name;
        this.reservables = new ArrayList<>();
    }

    public void addReservable(Reservable reservable) {
        reservables.add(reservable);
    }

    public void removeReservable(Reservable reservable) {
        reservables.remove(reservable);
    }


    public void reserve() {
        System.out.println("Memesan semua barang di area tersebut: " + name);
        for (Reservable reservable : reservables) {
            reservable.reserve();
        }
    }

 
    public void release() {
        System.out.println("Melepaskan semua item di area: " + name);
        for (Reservable reservable : reservables) {
            reservable.release();
        }
    }

 
    public boolean isReserved() {
        for (Reservable reservable : reservables) {
            if (reservable.isReserved()) {
                return true;
            }
        }
        return false;
    }
}
