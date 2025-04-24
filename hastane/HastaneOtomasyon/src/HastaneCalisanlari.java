import java.util.ArrayList;

class HastaneCalisanlari extends Hastane {
    private final int sicilNo; // Değiştirilemez (read-only) özellik
    private double ekGosterge;
    private String calistigiDepartman;

    // Parametreli kurucu metot
    public HastaneCalisanlari(String ad, String soyad, String tc, String cinsiyet,
                              int sicilNo, double ekGosterge, String calistigiDepartman) {
        super(ad, soyad, tc, cinsiyet);
        this.sicilNo = sicilNo;
        this.ekGosterge = ekGosterge;
        this.calistigiDepartman = calistigiDepartman;
    }

    // Getter ve Setter metotları
    public int getSicilNo() {
        return sicilNo;
    }

    public double getEkGosterge() {
        return ekGosterge;
    }

    public void setEkGosterge(double ekGosterge) {
        this.ekGosterge = ekGosterge;
    }

    public String getCalistigiDepartman() {
        return calistigiDepartman;
    }

    public void setCalistigiDepartman(String calistigiDepartman) {
        this.calistigiDepartman = calistigiDepartman;
    }

    // Hasta bilgilerini yazdıran metot
    @Override
    public void hastaBilgileriniYazdir(ArrayList<Hasta> hastaListesi) {
        System.out.println("Hastane Çalışanı Bilgileri:");
        for (Hasta hasta : hastaListesi) {
            hasta.bilgileriYazdir();
        }
    }

    // Maaş hesaplama metodu
    public void maasHesapla() {
        double maas = 0;

        if (ekGosterge == 1500) {
            maas = 15000;
        } else if (ekGosterge > 1500 && ekGosterge <= 2200) {
            maas = 20000;
        } else if (ekGosterge > 2200 && ekGosterge <= 3000) {
            maas = 30000;
        } else if (ekGosterge > 3000 && ekGosterge <= 3600) {
            maas = 40000;
        }

        System.out.println("Maaş: " + maas + " TL");
    }
    
 //   Yeni bir metod eklenmiştir
    public void hastaneCalisanBilgileriniGoster(HastaneCalisanlari calisan) {
        System.out.println("Hastane Çalışanı: " + calisan.getAd() + " " + calisan.getSoyad() +
                ", Sicil No: " + calisan.getSicilNo() +
                ", Çalıştığı Departman: " + calisan.getCalistigiDepartman());
    }
}