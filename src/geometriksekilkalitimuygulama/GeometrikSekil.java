package geometriksekilkalitimuygulama;

public class GeometrikSekil {
    private int en;
    private int boy;

    public GeometrikSekil(int en, int boy) {
        this.en = en;
        this.boy = boy;
        System.out.println("Geometrik sekil olusturuluyor.");
    }
    
    public int getEn() {
        return en;
    }

    public void setEn(int en) {
        this.en = en;
    }

    public int getBoy() {
        return boy;
    }
    
    public void setBoy(int boy) {
        this.boy = boy;
    }
    
    public void alanHesapla()
    {
        System.out.println("Alan: "+getBoy()*getEn());
    }
    public void cevreHesapla()
    {
        System.out.println("Cevre: "+(getBoy()+getEn())*2);
    }

    @Override
    public String toString() {
        return "En: " + en +" Boy: "+boy; 
    }
    
}
