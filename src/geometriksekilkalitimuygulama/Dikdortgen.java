package geometriksekilkalitimuygulama;

public class Dikdortgen extends GeometrikSekil{
    
    public Dikdortgen(int en, int boy) {
        super(en, boy);
        System.out.println("Dikdortgen olusturuluyor.");
    }
    
    public void enVeBoyDegerleriniYaz()
    {
        System.out.println("Dikdortgenin eni:"+getEn() + "Dikdortgenin boyu: "+ getBoy());
    }
    public void ozellikYazdir()
    {
        System.out.println("Dikdortgenin eni:"+getEn() + "Dikdortgenin boyu: "+ getBoy());
        alanHesapla();
        cevreHesapla();
    }
    
}
