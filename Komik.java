public class Komik extends Buku{
    private int volume;

    public int getVolume(){
        return this.volume;
    }

    public void naikkanHarga(){
        this.harga = this.harga + 10_000;
    }
}
