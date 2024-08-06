public class SistemPembayaran {
    public void prosesPembayaran(Pelanggan pelanggan, double jumlah) {
        System.out.println("Pembayaran sebesar " + jumlah + " dari " + pelanggan.getNama() + " sedang diproses...");
        // Logika pembayaran
        System.out.println("Pembayaran berhasil.");
    }
}
