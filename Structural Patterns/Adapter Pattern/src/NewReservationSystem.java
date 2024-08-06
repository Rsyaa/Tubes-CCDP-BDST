interface NewReservationSystem {
    void bookTableOnline(String customerName, int tableNumber, String dateTime);
}

class NewReservationSystemImpl implements NewReservationSystem {
    
    public void bookTableOnline(String customerName, int tableNumber, String dateTime) {
        System.out.println("Reservation confirmed for " + customerName + "  table " + tableNumber + " on " + dateTime + " Menggunakan Sistem Reservasi Baru.");
    }
}
