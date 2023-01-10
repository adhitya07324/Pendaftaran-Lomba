package Entity;

public class PesertaLombaEntity extends BiodataEntity{
    private String umur;

    public PesertaLombaEntity(String umur,String nama,String noTelp,String alamat) {
        super(nama,noTelp,alamat);
        this.umur=umur;
    }
    
    public String getUmur() {
        return umur;
    }

    public void setUmur(String umur) {
        this.umur=umur;
    }
}