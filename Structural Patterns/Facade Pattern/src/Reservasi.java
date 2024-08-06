public class Reservasi {
    private Meja meja;
    private Pelanggan pelanggan;

    public Reservasi(Meja meja, Pelanggan pelanggan) {
        this.meja = meja;
        this.pelanggan = pelanggan;
        meja.setTersedia(false);
    }

    public Meja getMeja() {
        return meja;
    }

    public Pelanggan getPelanggan() {
        return pelanggan;
    }
}
