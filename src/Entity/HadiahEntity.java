package Entity;

public class HadiahEntity {
    private String Hadiahke1,Hadiahke2,Hadiahke3;
    private int Souvenir;
    public HadiahEntity(String hadiahke1,String hadiahke2,String hadiahke3,int souvenir){        
        this.Hadiahke1=hadiahke1;
        this.Hadiahke2=hadiahke2;
        this.Hadiahke3=hadiahke3;
        this.Souvenir=souvenir;
    }    
    
    public String getHadiahke1(){
        return Hadiahke1;
    }
    public void setHadiahke1(String hadiahke1){
        this.Hadiahke1=hadiahke1;
    }
    
    public String getHadiahke2(){
        return Hadiahke2;
    }
    public void setHadiahke2(String hadiahke2){
        this.Hadiahke2=hadiahke2;
    }
    
    public String getHadiahke3(){
        return Hadiahke3;
    }
    public void setHadiahke3(String hadiahke3){
        this.Hadiahke3=hadiahke3;
    }
    
    public int getSouvenir(){
        return Souvenir;
    }
    public void setSouvenir(int souvenir){
        this.Souvenir=souvenir;
    }
}
