
import java.util.Scanner;

public class Perpustakaan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //buat jalan atau berhenti
        boolean stay = true;
        //menyimpan input user
        String key;

        listbuku listBuku = new listbuku();

        listsiswa listSiswa = new listsiswa();

        BeneranListPetugas listpetugas = new BeneranListPetugas();


        buku selectedBuku = null;
        //if "stay" = true tetep lanjut
        while (stay) {
            System.out.println("======================");
            System.out.println("=--- PERPUSTAKAAN  --=");
            System.out.println("=---    ANDHIKA    --=");
            System.out.println("======================");
            System.out.println("1. Buku");
            System.out.println("2. Lihat Status Siswa");
            System.out.println("3. Petugas");
            System.out.println("4. Pinjam buku");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            int menu = input.nextInt();

            if (menu == 1) {
                System.out.println("===========================");
                System.out.println("=------- LIST BUKU -------=\n");
                listBuku.IsiBuku();
                System.out.println("Ketik apapun untuk keluar...");
                input.next();

            } else if (menu == 2) {
                System.out.println("===========================");
                System.out.println("=------ LIST SISWA -------=\n");
                listSiswa.IsiSiswa();
                System.out.println("Ketik apapun untuk keluar...");
                input.next();

            } else if (menu == 3) {
                System.out.println("===========================");
                System.out.println("=----- LIST PETUGAS ------=\n");
                listpetugas.IsiPetugas();
                System.out.println("Ketik apapun untuk keluar...");
                 input.next();


            } else if (menu == 4) {
                System.out.println("\n===========================");
                System.out.println("----- PEMINJAMAN BUKU -----");

                //selected untuk menyimpan data, contoh
                // "selectedIDSiswa"
                // "selectedIDBuku"


                int selectedIDSiswa, selectedIDBuku;

                System.out.print("Masukkan ID Siswa: ");
                selectedIDSiswa = input.nextInt();
                int foundIndex = listSiswa.cariSiswa(selectedIDSiswa);
                sisaw selectedSiswa = listSiswa.listsiswa[foundIndex];

                if (selectedSiswa.isStatus()) {
                    listSiswa.listsiswa[foundIndex].changeStatus();
                    listBuku.IsiBuku();
                    System.out.print("Pilih nomor buku yang ingin dipinjam: ");
                    selectedIDBuku = input.nextInt();
                    foundIndex = listBuku.cariBuku(selectedIDBuku);
                    selectedBuku = listBuku.listBuku[foundIndex];
                    System.out.println("\n");
                    System.out.println("=========================");
                    System.out.println("=-- STRUK PINJAM BUKU --=");
                    System.out.println("Judul Buku: " + selectedBuku.getJudulBuku());
                    System.out.println("Peminjam: " + selectedSiswa.getNama());
                    System.out.println("=========================\n");

                    listBuku.listBuku[foundIndex].kurangiStok();


                } else {
                    System.out.println("Maaf anda masih punya tanggungan buku");
                    System.out.print("Apakah anda ingin mengembalikan buku ? y/n : ");
                    key = input.next();
                    if (key.equalsIgnoreCase("Y") ) {
                        selectedSiswa.changeStatus();
                        assert selectedBuku != null;
                        selectedBuku.tambahStock();
                    }
                }

            } else if (menu == 5) {
                //untuk mengakhiri
                stay = false;
            }
        }
    }

}