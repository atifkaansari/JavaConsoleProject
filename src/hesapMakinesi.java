import java.util.Scanner;

public class hesapMakinesi {

	public static double topla(int s1,int s2) {
		return s1+s2;
	}
	public static double cikar(int s1, int s2) {
		return s1-s2;
	}
	public static double carpim(int s1, int s2) {
		return s1*s2;
	}
	public static double bolum(int s1, int s2) {
		if (s2 == 0){
			System.out.println("Hata: Sıfır'a Bölünme işlemi Yapılamaz!");
			return 0;
		}
		return s1/s2;
	}
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean devam = true;
		
		System.out.println("-----------------------"+ "\n" +"--- Hesap Makinesi ---" + "\n" + "-----------------------");
		
		while (devam) {
			System.out.println("Yapılacak işlemi Seçiniz: \n 1 - Toplama \n 2 - Çıkarma \n 3 - Çarpma \n 4 - Bölme \n 5 - Uygulamadan Çık");
			int secim = scan.nextInt();
			if(secim == 5) {
				System.out.println("Uygulama Kapatılıyor...");
				devam = false;
				continue;
			}
			
			System.out.print("1. Sayıyı Giriniz: ");
			int sayi1 = scan.nextInt();
			System.out.print("2. Sayıyı Giriniz: ");
			int sayi2 = scan.nextInt();
			
			double sonuc = 0;
			
			switch (secim) {
			case 1:
				sonuc = topla(sayi1, sayi2);
				break;
			case 2:
				sonuc = cikar(sayi1,sayi2);
				break;
			case 3:
				sonuc = carpim(sayi1 , sayi2);
				break;
			case 4:
				sonuc = bolum(sayi1,sayi2);
				break;
			default:
				System.out.println("Geçersiz Seçim! Lütfen tekrar deneyiniz. ");
				continue;
			}
			System.out.println("Sonuç: "+sonuc);
			
		}
		scan.close();

	}

}
