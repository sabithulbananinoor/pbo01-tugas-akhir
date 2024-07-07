public class Pengguna {
    private int id;
    private String username;
    private String password;

    public Pengguna(){
        System.out.println("Object Telah dibuat, konstraktor berjalan");
    }

    public void hapus(){
        System.out.println("DELETE FROM pengguna");
    }
    public void hapus(int id){
        System.out.println("DELETE FROM pengguna WHERE id=" + id);
    }
    public void hapus(String username){
        System.out.println("DELETE FROM pengguna WHERE username=" + username);
    }

    public void login(){
        System.out.println("Ini method untuk Login");
    }

    public void login(String tokenGoogle){
        System.out.println("Ini Login Menggunakan Google");
    }

    public void lupaPassword(){
        System.out.println("Ini method untuk Lupa Password");
    }

    public void daftar(){
        System.out.println("Ini method untuk Daftar Pengguna Baru");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
