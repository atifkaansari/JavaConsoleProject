import java.util.Scanner;
import java.util.Random;
public class SayiTahminOyunu {

	public static int sayiUret() {
		Random rand = new Random();
		return rand.nextInt(50)+1;
	}
	
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	boolean devam = true;
	
	while(devam){
		int sayi = sayiUret();
		int hak = 5;
		
		System.out.println("\n--- Sayı Tahmin Oyunu Başladı! ---");
        System.out.println("1 ile 100 arasında bir sayı tuttum. Bakalım bulabilecek misin?");
        
        while (hak > 0) {
        	System.out.print("Tahmininizi girin: ");
            int tahmin = scan.nextInt();
            
            if (tahmin == sayi) {
            	 System.out.println("Tebrikler! Doğru tahmin ettiniz.");
                 break;
            }else if(tahmin < sayi) {
                System.out.println("Yukarı çık! Daha büyük bir sayı gir.");
            }else {
                System.out.println("Aşağı in! Daha küçük bir sayı gir.");
            }
            hak--;
            System.out.println("Kalan hak: " + hak);
        }
        if (hak == 0) {
            System.out.println("Maalesef hakkınız bitti. Doğru sayı: " + sayi);
        }
        System.out.print("Tekrar oynamak ister misiniz? (E/H): ");
        char tekrar = scan.next().charAt(0);
        if (tekrar == 'H' || tekrar == 'h') {
            devam = false;
            System.out.println("Oyun kapatılıyor...");
        }
	}
    scan.close();
	}

}
