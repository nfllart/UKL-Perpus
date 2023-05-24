
public class sisaw {
    private final int idsisaw;
    private final String nama, alamat, telfon;
    boolean status;

    sisaw(int idsisaw, String nama, String alamat, String telfon, boolean status) {
        this.idsisaw = idsisaw;
        this.nama = nama;
        this.alamat = alamat;
        this.telfon = telfon;
        this.status = status;
    }
    //getter setter
    public int getIdSiswa() {
        return idsisaw;
    }
    //overload
    public int getIdSiswa(double id){
        int id2 = (int)id;
        return id2;
    }
    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }
    public String getTelepon() {
        return telfon;
    }

    //method untuk mengubah status peminjaman siswa
    public void changeStatus() {
        this.status = !this.status;

    }
    public String getStatus() {
        if (status) {
            return "Diijinkan meminjam";
        }
        else{
            return "Tidak Diijinkan meminjam";
        }
    }

    public boolean isStatus() {
        return status;
    }




}
