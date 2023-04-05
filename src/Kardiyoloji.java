public class Kardiyoloji extends IsGucu {
    private String unvan;

    public Kardiyoloji(String ad, String soyad, int kimlikNo,String unvan) {
        super(ad, soyad, kimlikNo);
        this.unvan=unvan;
    }

    @Override
    void yaka_karti_oku() {

    }

    void risk_hesapla() throws  InterruptedException{
        System.out.println(unvan+" doktor "+getAd()+"tarafından kalp krizi riski hesaplanıyor...");
        Thread.sleep(3000);
        System.out.println("İnceleme başarıyla tamamlandı");
    }
    void ekg_cek() throws  InterruptedException {
        System.out.println(unvan + " doktor " + getAd() + " tarafından EKG çekimi yapılıyor...");
        Thread.sleep(3000);
        System.out.println("EKG başarıyla çekildi");
    }
}
