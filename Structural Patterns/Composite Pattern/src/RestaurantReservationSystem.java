public class RestaurantReservationSystem {
    public static void main(String[] args) {
        // Membuat beberapa meja
        Table table1 = new Table(1);
        Table table2 = new Table(2);
        Table table3 = new Table(3);

        // Membuat area restoran dan menambahkan meja ke dalamnya
        Area area1 = new Area("Area 1");
        area1.addReservable(table1);
        area1.addReservable(table2);

        Area area2 = new Area("Area 2");
        area2.addReservable(table3);

        // Membuat area utama restoran
        Area mainArea = new Area("Main Area");
        mainArea.addReservable(area1);
        mainArea.addReservable(area2);

        // Reservasi pada area dan meja tertentu
        mainArea.reserve();
        System.out.println();

        // Merilis reservasi
        mainArea.release();
    }
}
