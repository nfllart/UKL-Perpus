public class buku extends listbuku{

    private final int idbuku;
    private int stok;
    private final String judul;

    public buku(int idbuku, String judul, int stok){
        this.idbuku=idbuku;
        this.stok = stok;
        this.judul= judul;
    }

//    getter setter

    public int getIdbuku(){
        return idbuku;
    }

    public int getStok() {
        return stok;
    }

    public String getJudulBuku() {
        return judul;
    }

    // method untuk mengurangi jumlah buku 1
    public void kurangiStok(){
        this.stok--;
    }
    public void tambahStock(){
        this.stok++;
    }

}
