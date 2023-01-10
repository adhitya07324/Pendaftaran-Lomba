/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Process;
import Entity.HadiahEntity;
import Entity.LombaEntity;
import java.util.Scanner;
public class LombaProcess implements Interface {
    private static Scanner input=new Scanner(System.in);
    public static HadiahEntity[] hadiah=new HadiahEntity[50];
    public static int jumHadiah=0;
    
    public HadiahEntity[] getHadiah(){
        return hadiah;
    }
    public void insert(String hadiahke1,String hadiahke2,String hadiahke3,int souvenir){        
        hadiah[jumHadiah]=new HadiahEntity(hadiahke1,hadiahke2,hadiahke3,souvenir);
        jumHadiah=jumHadiah+1;
    }
    
    @Override
    public void view() {
        try{
            for (int i=0;i<LombaEntity.lomba.length;i++) {            
                for(int j=i;i<LombaProcess.hadiah.length;i++){
                    
                    System.out.println(i + ". " + LombaEntity.lomba[i]);            
                    System.out.println("Hadiah Pertama\t"+LombaProcess.hadiah[i].getHadiahke1());
                    System.out.println("Hadiah Kedua \t"+LombaProcess.hadiah[i].getHadiahke2());
                    System.out.println("Hadiah Ketiga \t"+LombaProcess.hadiah[i].getHadiahke3());
                    System.out.println("Souvenir \t"+LombaProcess.hadiah[i].getSouvenir());
                }            
            }
        }catch(Exception e){
            System.out.println("\n");
            System.out.println(" ");
        }
        
    }
    

    
}
