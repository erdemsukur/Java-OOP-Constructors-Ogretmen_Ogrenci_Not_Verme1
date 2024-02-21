package deneme3;

public class OgrenciMain {

	public static void main(String[] args) {
		  Ogrenci ogrenci1 = new Ogrenci("Ali", "Yılmaz", "9B");
	        Ogrenci ogrenci2 = new Ogrenci("Ayşe", "Kara", "10A");

	        Ogretmen ogretmen = new Ogretmen("Mehmet", "Demir", "10A");
	        ogretmen.notGir(ogrenci1, 75, 65);
	        ogretmen.notGir(ogrenci2, 40, 75);
	        
	        ogrenci1.durumunuYazdir();
	        ogrenci2.durumunuYazdir();

	}

}
