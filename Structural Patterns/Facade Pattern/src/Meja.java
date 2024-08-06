public class Meja {
    private int nomorMeja;
    private boolean tersedia;

    public Meja(int nomorMeja) {
        this.nomorMeja = nomorMeja;
        this.tersedia = true;
    }

    public int getNomorMeja() {
        return nomorMeja;
    }

    public boolean isTersedia() {
        return tersedia;
    }

    public void setTersedia(boolean tersedia) {
        this.tersedia = tersedia;
    }
}
