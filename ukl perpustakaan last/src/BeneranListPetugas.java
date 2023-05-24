public class BeneranListPetugas {
    
        Petugas[] BeneranListPetugas = {
                new Petugas(1,"sumanto","Kawi","0819384753098"),
                new Petugas(2,"najwano","Mendit","8123087429312"),
                new Petugas(3,"kennedy","America","0810324592342"),

        };
        public void IsiPetugas(){
            System.out.println("No.\t NAMA\t\t    ALAMAT\t\tTELFON");
            System.out.println("_____________________________________________");
            for (Petugas Petugas : BeneranListPetugas) {
                System.out.println(Petugas.getIdpetugas() + " \t " +
                        Petugas.getnama()+" \t\t" +
                        Petugas.getalamat()+"\t\t" +
                        Petugas.gettelfon()+"\t\t");
            }
        }
}
