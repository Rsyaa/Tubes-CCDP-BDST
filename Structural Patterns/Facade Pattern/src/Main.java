public class Main {
    public static void main(String[] args) {
        SistemReservasi sistemReservasi = new SistemReservasi(5); 

        Pelanggan pelanggan1 = new Pelanggan("Gwenn", "08123456789");
        Pelanggan pelanggan2 = new Pelanggan("Joice", "08234567890");

        sistemReservasi.reservasiMeja(pelanggan1, 150.0); 
        sistemReservasi.reservasiMeja(pelanggan2, 200.0); 
    }
}
