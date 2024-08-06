public class Notifikasi {
    public void kirimNotifikasi(Pelanggan pelanggan, String pesan) {
        System.out.println("Mengirim notifikasi ke " + pelanggan.getKontak() + ": " + pesan);
    }
}
