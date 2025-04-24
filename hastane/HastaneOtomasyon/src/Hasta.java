import java.util.ArrayList;

// Alt sınıf: Hasta - Hastane sınıfından türetilmiştir
class Hasta extends Hastane {
    private String yatisTarihi;
    private String poliklinikBilgisi;

    // Parametreli kurucu metot
    public Hasta(String ad, String soyad, String tc, String cinsiyet, String yatisTarihi, String poliklinikBilgisi) {
        super(ad, soyad, tc, cinsiyet);
        this.yatisTarihi = yatisTarihi;
        this.poliklinikBilgisi = poliklinikBilgisi;
    }

    // Getter ve Setter metotları
    public String getYatisTarihi() {
        return yatisTarihi;
    }

    public void setYatisTarihi(String yatisTarihi) {
        this.yatisTarihi = yatisTarihi;
    }

    public String getPoliklinikBilgisi() {
        return poliklinikBilgisi;
    }

    public void setPoliklinikBilgisi(String poliklinikBilgisi) {
        this.poliklinikBilgisi = poliklinikBilgisi;
    }

 // Hasta bilgilerini yazdıran metot
    @Override
    public void hastaBilgileriniYazdir(ArrayList<Hasta> hastaListesi) {
        System.out.println("Hasta Bilgileri:");
        for (Hasta hasta : hastaListesi) {
            hasta.bilgileriYazdir();
        }
    }

    // Hasta bilgilerini yazdıran genel metot
    public void bilgileriYazdir() {
        System.out.println("Hasta: " + getAd() + " " + getSoyad() +
                ", Yatış Tarihi: " + getYatisTarihi() +
                ", Poliklinik Bilgisi: " + getPoliklinikBilgisi());
    }
    
 // Yeni bir metod eklenmiştir
    public void hastaBilgileriniGoster(Hasta hasta) {
        System.out.println("Hasta : " + hasta.getAd() + " " + hasta.getSoyad() +
                ", Poliklinik Bilgisi: " + hasta.getPoliklinikBilgisi() +
                ", Yatış Tarihi: " + hasta.getYatisTarihi());
    }
}