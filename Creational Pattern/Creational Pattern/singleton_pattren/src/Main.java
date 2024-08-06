public class Main {
    public static void main(String[] args) {
        ReservationSystem reservationSystem1 = new ReservationSystem();
        reservationSystem1.makeReservation("2024-08-05", "19:00", 4);
        
        ReservationSystem reservationSystem2 = new ReservationSystem();
        reservationSystem2.makeReservation("2024-08-06", "20:00", 2);

        assert reservationSystem1 == reservationSystem2 : "Different instances!";
    }
}