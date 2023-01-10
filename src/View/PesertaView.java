/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;
import Entity.*;
import Process.*;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class PesertaView {
    private static Scanner input=new Scanner(System.in);
    private static PanitiaProcess prosesPanitia=new PanitiaProcess();
    private static PesertaProcess prosesPeserta=new PesertaProcess();
    private static LombaProcess prosesLomba=new LombaProcess();
    private static int pilLomba;    
    public void insertPeserta() {
        System.out.println("Input Nama\t: ");
        String nama=input.nextLine();
        System.out.println("Input Umur\t: ");
        String umur=input.nextLine();
        System.out.println("Input Alamat\t: ");
        String alamat=input.nextLine();
        System.out.println("Input No.Telp\t: ");
        String noTelp=input.nextLine();
        prosesPeserta.insert(nama,umur,alamat,noTelp);
        insertLomba();
    }

    public void insertLomba() {        
        System.out.println("Lomba : ");
        prosesLomba.view();
        System.out.println("Pilih lomba\t: ");
        pilLomba=input.nextInt();
        System.out.println("Input Kode Peserta\t: ");
        String kodePeserta=input.next();
        prosesPeserta.insert(prosesPeserta.getPeserta()[prosesPeserta.jumPeserta],pilLomba,kodePeserta);
    }
}
