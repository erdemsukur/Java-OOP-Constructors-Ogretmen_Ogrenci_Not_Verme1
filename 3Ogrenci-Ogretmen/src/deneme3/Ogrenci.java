package deneme3;

public class Ogrenci {
    private String isim2;
    private String soyisim;
    private String sinif;
    private int not1;
    private int not2;
    private boolean isPass;

    public Ogrenci(String isim2, String soyisim, String sinif) {
        this.isim2 = isim2;
        this.soyisim = soyisim;
        this.sinif = sinif;
    }

    public double ortalamaHesapla() {
        double ortalama = (not1 + not2) / 2.0;
        if (ortalama >= 50) {
            this.isPass = true;
        } else {
            this.isPass = false;
        }
        return ortalama;
    }

    public void setNot1(int not1) {
        this.not1 = not1;
    }

    public void setNot2(int not2) {
        this.not2 = not2;
    }

    public String getSinif() {
        return sinif;
    }
    public String getIsim2() {
        return isim2;
    }
    

    public void durumunuYazdir() {
        if (isPass) {
            System.out.println(isim2 + " " + soyisim + " öğrencisi " + sinif + " sınıfında geçti. Ortalama: " + ortalamaHesapla());
        }
    }
}

