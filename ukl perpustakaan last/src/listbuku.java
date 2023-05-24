public class listbuku {
        //array untuk list (yang sudah disederhanakan)
        buku[] listBuku = {
                new buku(1, "Conana", 34),
                new buku(2, "Marvel", 51),
                new buku(3, "Gamaran", 12),
                new buku(4, "OPM 2 ", 8),
        };

        //method untuk menampilkan data list buku
        public void IsiBuku(){
            System.out.println("No.\t JUDUL \t\t     STOK");
            System.out.println("__________________________");
            for (buku buku : listBuku) {
                System.out.println(buku.getIdbuku() + " \t " +
                        buku.getJudulBuku() + " \t\t " +
                        buku.getStok());
            }
        }

        public int cariBuku(int id){
            int found = 0;

            //pencarian data berdasarkan id
            for (int i = 0; i < listBuku.length; i++) {
                if (listBuku[i].getIdbuku()== id) {
                    found = i;
                    //nyimpen nilai index dari data yg ditemukan
                }
            }
            return found;
        }

    }
