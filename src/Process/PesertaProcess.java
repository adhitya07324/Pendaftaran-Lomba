package Process;

import Entity.PesertaLombaEntity;
import Entity.PesertaTerdatftarEntity;
import Entity.LombaEntity;
import java.util.Scanner;

public class PesertaProcess implements Interface{
    
    private static Scanner input=new Scanner(System.in);
    private static PesertaLombaEntity[] peserta=new PesertaLombaEntity[50];
    private static PesertaTerdatftarEntity[] pesertaTerdaftar=new PesertaTerdatftarEntity[50];
    public static int jumPeserta=0;

    public PesertaLombaEntity[] getPeserta(){
        return peserta;
    }
    
    public PesertaTerdatftarEntity[] getPesertaTerdaftar(){
        return pesertaTerdaftar;
    }

    public void insert(String nama,String umur,String alamat,String noTelp){
        peserta[jumPeserta]=new PesertaLombaEntity(umur,nama,noTelp,alamat);
    }
    
    public void insert(PesertaLombaEntity peserta,int index,String kodePeserta){
        pesertaTerdaftar[jumPeserta]=new PesertaTerdatftarEntity(peserta, index, kodePeserta);
        jumPeserta=jumPeserta+1;
    }
    @Override
    public void view() {
        if (jumPeserta==0) {
            System.out.println("Belum ada peserta mendaftar!!!");
        } else {
            for (int i = 0; i < jumPeserta; i++) {
                System.out.println("Kode Peserta\t: "+pesertaTerdaftar[i].getKodePeserta());                
                System.out.println("Nama\t: "+peserta[i].getNama());
                System.out.println("Umur\t: "+peserta[i].getUmur());
                System.out.println("Alamat\t: "+peserta[i].getAlamat());
                System.out.println("No.Telp\t: "+peserta[i].getNoTelp());
                System.out.println("Lomba\t: "+LombaEntity.lomba[pesertaTerdaftar[i].getIndexLomba()]+"\n");
            }
        }
    }
    
    public void update() {
        System.out.print("Masukan Kode Peserta yang mau di diubah : ");
        String search=input.next();
        int cari=0;
        do {
            if (cari == jumPeserta) {
                System.err.println("Tidak ada data!!!");
                break;
            } else if (pesertaTerdaftar[cari].getKodePeserta().equals(search)) {
                int pilEdit;
                do {
                    System.out.println("Pilih data yang ingin diubah : ");
                    System.out.println("1.Lihat Biodata");
                    System.out.println("2.Nama");
                    System.out.println("3.Alamat");
                    System.out.println("4.No. Telp");
                    System.out.println("5.Umur");
                    System.out.println("6.Lomba");
                    System.out.println("0.Exit");
                    System.out.println("Pilihan Anda : ");
                    pilEdit=input.nextInt();
                    input.nextLine();
                    if (pilEdit == 1) {                        
                        System.out.println("Kode Peserta\t: "+pesertaTerdaftar[cari].getKodePeserta());
                        System.out.println("\nNama\t: "+peserta[cari].getNama());
                        System.out.println("\nUmur\t: "+peserta[cari].getUmur());
                        System.out.println("\nAlamat\t: "+peserta[cari].getAlamat());
                        System.out.println("\nNo.Telp\t: "+peserta[cari].getNoTelp());
                        System.out.println("\nLomba\t: "+LombaEntity.lomba[pesertaTerdaftar[cari].getIndexLomba()]);
                    } else if (pilEdit == 2) {
                        System.out.print("Ubah Nama\t: ");
                        String editNama = input.nextLine();
                        peserta[cari].setNama(editNama);
                    } else if (pilEdit == 3) {
                        System.out.print("Ubah Alamat\t: ");
                        String editAlamat = input.nextLine();
                        peserta[cari].setAlamat(editAlamat);
                    } else if (pilEdit == 4) {
                        System.out.print("Ubah No. Telp\t: ");
                        String editNotelp = input.nextLine();
                        peserta[cari].setNoTelp(editNotelp);
                    } else if (pilEdit == 5) {
                        System.out.print("Ubah Umur\t: ");
                        String editUmur = input.nextLine();
                        peserta[cari].setUmur(editUmur);
                    } else if (pilEdit == 6) {
                        System.out.println("Pilih Lomba : ");
                        for (int i=0;i<LombaEntity.lomba.length;i++) {
                            System.out.println(i+". "+LombaEntity.lomba[i]);
                        }
                        System.out.println("Pilih lomba\t: ");
                        int editLomba=input.nextInt();
                        pesertaTerdaftar[cari].setIndexLomba(editLomba);
                    }
                } while (pilEdit!=0);
                break;
            } else {
                cari=cari+1;
            }
        } while (true);
    }
    
    public void delete() {
        System.out.print("Masukan Kode Peserta yang akan di hapus : ");
        String search=input.next();
        input.nextLine();
        int cari=0;
        do {
            if (cari==jumPeserta) {
                System.err.println("Tidak ada data!!!");
                break;
            } else if (pesertaTerdaftar[cari].getKodePeserta().equals(search)) {
                if (cari==jumPeserta-1) {
                    jumPeserta=jumPeserta-1;
                } else {
                    for (int i=cari;i<jumPeserta;i++) {
                        pesertaTerdaftar[i]=pesertaTerdaftar[i+1];
                        peserta[i]=peserta[i+1];
                    }
                    jumPeserta=jumPeserta-1;
                }
                break;
            } else {
                cari=cari+1;
            }
        } while(true);
    }
}