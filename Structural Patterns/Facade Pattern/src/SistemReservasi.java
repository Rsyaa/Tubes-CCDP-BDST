public class SistemReservasi {
    private PengelolaMeja pengelolaMeja;
    private SistemPembayaran sistemPembayaran;
    private Notifikasi notifikasi;

    public SistemReservasi(int jumlahMeja) {
        pengelolaMeja = new PengelolaMeja(jumlahMeja);
        sistemPembayaran = new SistemPembayaran();
        notifikasi = new Notifikasi();
    }

    public void reservasiMeja(Pelanggan pelanggan, double jumlahPembayaran) {
        Meja meja = pengelolaMeja.cekKetersediaanMeja();
        if (meja != null) {
            sistemPembayaran.prosesPembayaran(pelanggan, jumlahPembayaran);
            Reservasi reservasi = new Reservasi(meja, pelanggan);
            notifikasi.kirimNotifikasi(pelanggan, "Reservasi berhasil untuk Meja " + meja.getNomorMeja());
        } else {
            System.out.println("Maaf, tidak ada meja yang tersedia.");
        }
    }
}
