import java.util.ArrayList;
//Alt sınıf: Doktor - HastaneCalisanlari sınıfından türetilmiştir
class Doktor extends HastaneCalisanlari {
 private final double diplomaNotu; 
 private String bransi;

 // Parametreli kurucu metot
 public Doktor(String ad, String soyad, String tc, String cinsiyet,
               int sicilNo, double ekGosterge, String calistigiDepartman,
               double diplomaNotu, String bransi) {
     super(ad, soyad, tc, cinsiyet, sicilNo, ekGosterge, calistigiDepartman); // Hata düzeltildi
     this.diplomaNotu = diplomaNotu;
     this.bransi = bransi;
 }

 // Getter metotları
 public double getDiplomaNotu() {
     return diplomaNotu;
 }

 public String getBransi() {
     return bransi;
 }

 // Hasta bilgilerini yazdıran metot
 @Override
 public void hastaBilgileriniYazdir(ArrayList<Hasta> hastaListesi) {
     System.out.println("Doktor Bilgileri:");
     for (Hasta hasta : hastaListesi) {
         hasta.bilgileriYazdir();
     }
 }

 // Maaş hesaplama metodu - override edilmiştir
 @Override
 public void maasHesapla() {
     double maas = 0;

     if (getEkGosterge() == 1500) {
         maas = 15000; 
     } else if (getEkGosterge() > 1500 && getEkGosterge() <= 2200) {
         maas = 20000;
     } else if (getEkGosterge() > 2200 && getEkGosterge() <= 3000) {
         maas = 30000;
     } else if (getEkGosterge() > 3000 && getEkGosterge() <= 3600) {
         maas = 40000;
     }

     System.out.println("Maaş: " + maas + " TL");
 }
}