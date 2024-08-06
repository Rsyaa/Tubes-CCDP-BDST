class ReservationAdapter implements NewReservationSystem {
    private OldReservationSystem oldReservationSystem;

    public ReservationAdapter(OldReservationSystem oldReservationSystem) {
        this.oldReservationSystem = oldReservationSystem;
    }

    @Override
    public void bookTableOnline(String customerName, int tableNumber, String dateTime) {
        System.out.println("Menggunakan adaptor untuk mengonversi permintaan dari sistem baru ke sistem lama...");
        oldReservationSystem.reserveTable(customerName, tableNumber);
    }
}
