// Temel sınıf: Hastane
import java.util.ArrayList;

class Hastane {
    private String ad;
    private String soyad;
    private final String tc; // Değiştirilemez (read-only) özellik
    private String cinsiyet;

    // Parametreli kurucu metot
    public Hastane(String ad, String soyad, String tc, String cinsiyet) {
        this.ad = ad;
        this.soyad = soyad;
        this.tc = tc;
        this.cinsiyet = cinsiyet;
    }

    // Getter ve Setter metotları
    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getTc() {
        return tc;
    }

    public String getCinsiyet() {
        return cinsiyet;
    }

    public void setCinsiyet(String cinsiyet) {
        this.cinsiyet = cinsiyet;
    }

    // Hasta bilgilerini arraylistte tutan ve yazdıran metot

    public void hastaBilgileriniYazdir(ArrayList<Hasta> hastaListesi) {
        System.out.println("Hastane Bilgileri:");
        for (Hasta hasta : hastaListesi) {
            hasta.bilgileriYazdir();
        }
    }
}