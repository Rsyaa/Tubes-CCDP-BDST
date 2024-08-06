import java.util.ArrayList;
import java.util.List;

public class PengelolaMeja {
    private List<Meja> mejaList;

    public PengelolaMeja(int jumlahMeja) {
        mejaList = new ArrayList<>();
        for (int i = 1; i <= jumlahMeja; i++) {
            mejaList.add(new Meja(i));
        }
    }

    public Meja cekKetersediaanMeja() {
        for (Meja meja : mejaList) {
            if (meja.isTersedia()) {
                return meja;
            }
        }
        return null; // jika tidak ada meja yang tersedia
    }
}
