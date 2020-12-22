package geometriksekilkalitimuygulama;

public class GeometrikSekilKalitimUygulama {

  
    public static void main(String[] args) {
        Dikdortgen d1 = new Dikdortgen(4,5);
        d1.ozellikYazdir();
        System.out.println(d1);
        
        GeometrikSekil gs1 = new Dikdortgen(10, 20);
        System.out.println(gs1);
        
        Kare k1 = new Kare(10,10);
        k1.alanHesapla();
        System.out.println(k1);
        
    }
    
}
