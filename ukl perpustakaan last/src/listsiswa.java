
public class listsiswa {

    sisaw[] listsiswa = {
            new sisaw(123,"naufal","sulfat","081233249724",true),
            new sisaw(234,"parlan","mars","081231928734",true),
            new sisaw(335,"agusar","black","081231720344",true),

    };
    public void IsiSiswa(){
        System.out.println("Nama \t ID \t\t\tALAMAT\t\tNOMOR\t\t\t    STATUS");
        System.out.println("___________________________________________________________________________");
        for (sisaw sisaw : listsiswa) {
            System.out.println(sisaw.getNama() + " \t " +
                    sisaw.getIdSiswa()+" \t\t\t" +
                    sisaw.getAlamat()+"\t\t" +
                    sisaw.getTelepon()+"\t\t" +
                    sisaw.getStatus());
        }
    }

    //mencari id
    public int cariSiswa(int id){
        int found = 0;
        for (int i = 0; i < listsiswa.length; i++) {
            if (listsiswa[i].getIdSiswa() == id) {
                found = i;
            }

        }
        return found;
    }


}
