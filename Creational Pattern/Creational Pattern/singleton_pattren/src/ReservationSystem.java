class ReservationSystem {
    private Database database;

    public ReservationSystem() {
        this.database = Database.getInstance();
    }

    public void makeReservation(String date, String time, int numberOfPeople) {
        // Code to make a reservation using the database connection
        System.out.println("Reservation made for " + numberOfPeople + " people on " + date + " at " + time + ".");
        System.out.println("Using database connection: " + database.getConnection().getStatus());
    }
}
