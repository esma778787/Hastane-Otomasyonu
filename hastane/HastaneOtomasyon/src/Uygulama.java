import java.util.ArrayList;

public class Uygulama {

	public static void main(String[] args) {
		// ArrayList'ler oluşturulmuştur
        ArrayList<Hasta> hastaListesi = new ArrayList<>();
       
        // Örnek nesneler oluşturularak ArrayList'lere ekleniyor
        Hasta hasta1 = new Hasta("Ayşe", "Demir", "23456789012", "Kadın", "2023-11-30", "Kardiyoloji");

        HastaneCalisanlari calisan1 = new HastaneCalisanlari("Mehmet", "Kaya", "45678901234", "Erkek", 101, 1500, "Acil Servis");
        Doktor doktor1 = new Doktor("Dr. Fatma", "Öz", "56789012345", "Kadın", 201, 2200, "Kardiyoloji", 85.5, "Kardiyolog");

        // Hasta bilgileri ekleniyor
        hasta1.hastaBilgileriniYazdir(hastaListesi);
        hasta1.hastaBilgileriniGoster(hasta1);

        // Hastane çalışanı ve doktor bilgileri ekleniyor
        calisan1.hastaBilgileriniYazdir(hastaListesi);
        calisan1.hastaneCalisanBilgileriniGoster(calisan1);
        calisan1.maasHesapla();

        doktor1.hastaBilgileriniYazdir(hastaListesi);
        doktor1.hastaneCalisanBilgileriniGoster(doktor1);
        doktor1.maasHesapla();


	}

}
