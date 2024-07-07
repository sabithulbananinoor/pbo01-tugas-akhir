public class Ikan {
    private String jenis;
    private String warna;
    private int beratKg;
    private int harga;
    private boolean masihHidup;

    public Ikan() {
    }

    public void berenang(){
        System.out.println("ikan sedang berenang");
    }

    public void makan(){
        System.out.println("ikan sedang makan");
    }

    public void buangKotoran(){
        System.out.println("Ikan sedang buang kotoran");
    }

    public void digoreng(){
        System.out.println("Ikan goreng rasanya maknyus");
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public int getBeratKg() {
        return beratKg;
    }

    public void setBeratKg(int beratKg) {
        this.beratKg = beratKg;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public boolean isMasihHidup() {
        return masihHidup;
    }

    public void setMasihHidup(boolean masihHidup) {
        this.masihHidup = masihHidup;
    }
}
