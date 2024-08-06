public class RestaurantReservationSystem {
    public static void main(String[] args) {

        OldReservationSystem oldSystem = new OldReservationSystem();

        NewReservationSystem adapter = new ReservationAdapter(oldSystem);

        NewReservationSystem newSystem = new NewReservationSystemImpl();

        adapter.bookTableOnline("Gwenn", 5, "2024-08-07 19:00");
        newSystem.bookTableOnline("Joice", 10, "2024-08-07 20:00");
    }
}
