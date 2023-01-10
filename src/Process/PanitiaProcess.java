package Process;

import Entity.PanitiaEntity;

public class PanitiaProcess implements Interface{
    private static PanitiaEntity[] panitia=new PanitiaEntity[50];
    private static int jumPanitia=0;
    
    public PanitiaEntity[] getPanitia(){
        return panitia;
    }

    public void insert(String[] passPanitia,String[] namaPanitia,String[] noTelpPanitia,String[] alamatPanitia){
        for (int i=0;i<namaPanitia.length;i++) {
            panitia[i]=new PanitiaEntity(passPanitia[i],namaPanitia[i],noTelpPanitia[i],alamatPanitia[i]);
            jumPanitia++;
        }
    }

    @Override
    public void view() {
        for (int i=0;i<jumPanitia;i++) {
            System.out.println("Nama\t: "+panitia[i].getNama());
            System.out.println("No. Telp: "+panitia[i].getNoTelp());
            System.out.println("Alamat\t: "+panitia[i].getAlamat());
            System.out.println("");
        }
    }
    
    public int cekData(String user,String password) {
        int loop=0;
        for (PanitiaEntity prosesPanitia:panitia) {
            if (prosesPanitia.getNama().equals(user) && prosesPanitia.getPassword().equals(password)) {
                break;
            } else {
                loop++;
            }
        }
        return loop;
    }
}
