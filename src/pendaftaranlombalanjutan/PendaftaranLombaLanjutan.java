package pendaftaranlombalanjutan;

import Process.*;
import Entity.HadiahEntity;
import java.util.Scanner;

public class PendaftaranLombaLanjutan {     
    public static void main(String[] args) {        
        Menu menu1=new Menu();
        menu1.data();
        menu1.data("Kaos", "Alat Tulis Lengkap", "Tumbler", 10);
        menu1.data("Uang 100 Ribu", "Boneka", "Buku 1 pack", 10);
        menu1.data("Sepeda", "Jam Tangan", "Kaos", 20);
        menu1.menuAwal();
    }
}



    
//    static void loginPanitia() {
//        System.out.println("Nama\t: ");
//        String nama=input.next();
//        System.out.println("Password\t: ");
//        String password=input.next();
//        cekPanitia=prosesPanitia.cekData(nama,password);
//        System.out.println("Selamat Datang "+prosesPanitia.getPanitia()[cekPanitia].getNama());
//        int pil;
//        do {
//            System.out.println("Jumlah Peserta : "+PesertaProcess.jumPeserta);
//            System.out.println("1.Daftarkan Peserta");
//            System.out.println("2.Ubah Data Peserta");
//            System.out.println("3.Lihat Peserta Terdaftar");
//            System.out.println("4.Hapus Peserta");
//            System.out.println("0.Log Out");
//            System.out.println("Pilihan Anda : ");
//            pil = input.nextInt();
//            input.nextLine();
//            switch(pil) {
//                case 1:
//                    insertPeserta();break;
//                case 2:
//                    prosesPeserta.update();break;
//                case 3:
//                    prosesPeserta.view();break;
//                case 4:
//                    prosesPeserta.delete();break;
//            }
//        } while (pil!=0);
//    }