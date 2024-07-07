public class Buku {
    private int id;
    private String judul;
    private String penulis;
    private int jumlahHalaman;
    protected int harga;

    public Buku() {
        System.out.println("Object buku telah dibuat, constractor buku berjalan");
    }

    public void naikkanHarga(){
        this.harga = this.harga + 1000;
    }

    public void naikkanHarga(int kenaikan){
        harga += kenaikan;
    }

    public void membaca(){
        System.out.println("ini methot untuk membaca buku");
    }

    public void menulis(String tulisan){
        System.out.println("ini method membuat tulisan dibuku");
    }

    public void rilis(){
        System.out.println("Ini methor untuk merilis buku");
    }

    public int getid() {
        return id;
    }

    public void setid(int id) {
        this.id = id;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public int getJumlahHalaman() {
        return jumlahHalaman;
    }

    public void setJumlahHalaman(int jumlahHalaman) {
        this.jumlahHalaman = jumlahHalaman;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
}
