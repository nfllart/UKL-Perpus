public class Petugas implements Abstract {
    private final int idpetugas;
    private final String nama, alamat,telfon;

    public Petugas(int idpetugas, String nama, String alamat , String telfon) {
        this.idpetugas = idpetugas;
        this.nama = nama;
        this.alamat = alamat;
        this.telfon = telfon;
    }

    //polimorphisme
    @Override
    public int getIdpetugas() {
        return idpetugas;
    }

    @Override
    public String getnama() {
        return nama;
    }

    @Override
    public String getalamat() {
        return alamat;
    }

    @Override
    public String gettelfon() {
        return telfon;
    }
}
