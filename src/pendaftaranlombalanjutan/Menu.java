/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pendaftaranlombalanjutan;
import Process.*;
import Entity.*;
import View.*;
import java.util.Scanner;
/**
 *
 * @author user
 */
class loginMenu{
    public void formLogin(){
        
    }
    public void menuAwal(){
        
    }
    public void menuPanitia(){
        
    }
}
public class Menu extends loginMenu {
    private Scanner input=new Scanner(System.in);
    public void data() {
        PanitiaProcess prosesPanitia=new PanitiaProcess();
        String namaPanitia[]={"Rega", "Adit", "Esa"};
        String passPanitia[]={"01", "02", "03"};
        String noTelpPanitia[]={"08123456", "082321234", "083123456"};
        String alamatPanitia[]={"jl.Ranah", "jl.Tengah", "jl.KananKiri"};
        prosesPanitia.insert(passPanitia,namaPanitia,noTelpPanitia,alamatPanitia);
    }
    public boolean data(String hadiah1,String hadiah2,String hadiah3,int souvenir){
        LombaProcess prosesLomba=new LombaProcess();      
        prosesLomba.insert(hadiah1, hadiah2, hadiah3, souvenir);        
        return true;
    }
    public void formLogin(){
        PanitiaProcess prosesPanitia=new PanitiaProcess();        
        int index;
        System.out.println("Nama\t: ");
        String nama=input.next();
        System.out.println("Password\t: ");
        String password=input.next();
        index=prosesPanitia.cekData(nama,password);
        System.out.println("\nSelamat Datang "+prosesPanitia.getPanitia()[index].getNama());        
    }
    public void menuPanitia(){
        formLogin();
        int pil;
        do {
            System.out.println("Jumlah Peserta : "+PesertaProcess.jumPeserta);
            System.out.println("1.Daftarkan Peserta");
            System.out.println("2.Ubah Data Peserta");
            System.out.println("3.Lihat Peserta Terdaftar");
            System.out.println("4.Hapus Peserta");
            System.out.println("0.Log Out");
            System.out.println("Pilihan Anda : ");
            pil = input.nextInt();
            input.nextLine();
            switch(pil) {
                case 1:
                    new PesertaView().insertPeserta();break;
                case 2:
                    new PesertaProcess().update();break;
                case 3:
                    new PesertaProcess().view();break;
                case 4:
                    new PesertaProcess().delete();break;
            }
        } while (pil!=0);
    }
    public void menuAwal(){
        int pil;
        do {
            System.out.println("1.Login Panitia");
            System.out.println("2.Lihat Peserta Terdaftar");
            System.out.println("3.Lihat panitia");
            System.out.println("Pilihan Anda : ");
            pil=input.nextInt();
            input.nextLine();
            switch(pil) {
                case 1:
                    menuPanitia();break;
                case 2:
                    new PesertaProcess().view();break;
                case 3:
                    new PanitiaProcess().view();break;
            }
        } while (pil!=0);
    }
}
