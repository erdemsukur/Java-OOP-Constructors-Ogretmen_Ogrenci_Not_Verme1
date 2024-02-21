package deneme3;
class Ogretmen {
    private String isim;
    private String soyisim;
    private String sinif;
    Ogrenci ogrenci;

    public Ogretmen(String isim, String soyisim, String sinif) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.sinif = sinif;
    }

    public boolean notGir(Ogrenci ogrenci, int not1, int not2) {
        boolean durum = ogrenci.getSinif().equals(sinif);
        if (durum) {
            ogrenci.setNot1(not1);
            ogrenci.setNot2(not2);
            ogrenci.ortalamaHesapla();
        } else {
            System.out.println("Hata: " + ogrenci.getIsim2() + " isimli öğrencinin ders bilgisi uyumsuz");
        }
        return durum;
    }
}