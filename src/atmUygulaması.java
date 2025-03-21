import java.util.Scanner;
public class atmUygulaması {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double bakiye = 1000;
		boolean devam = true;
		
		while (devam) {
			System.out.println("----- Atm Uygulaması ----- \n "
					+ "* Lütfen Yapmak İstediğiniz İşlemi Seçiniz! \n "
					+ "1 - Bakiye Görüntüle \n "
					+ "2 - Para Yatır \n "
					+ "3 - Para Çek \n "
					+ "4 - Çıkış Yap \n ");
			int secim = scan.nextInt();
			switch(secim) {
				case 1:
					System.out.println("Güncel Bakiyeniz: " + bakiye + "TL");
					break;
				case 2:
					System.out.print("Yatırmak istediğiniz tutarı giriniz: ");
					double yatirilan = scan.nextDouble();
					if(yatirilan>0) {
						bakiye+=yatirilan;
						System.out.println(yatirilan + "TL hesabınıza Yatırıldı. Güncel Bakiye: "+ bakiye);
					}else {
						System.out.println("Geçersiz Tutar!");
					}
					break;
				case 3:
					System.out.println("Çekmek istediğiniz tutarı giriniz: ");
					double cekilecek = scan.nextDouble();
					if(cekilecek>0 && cekilecek<=bakiye) {
						bakiye-=cekilecek;
						System.out.println(cekilecek + "TL Hesabınızdan Çekildi. Kalan Bakiye: "+bakiye);
					}else {
						System.out.println("Yetersiz Bakiye veya Geçersiz Tutar! ");
					}
					break;
				case 4:
					System.out.println("Çıkış Yapılıyor...");
					devam = false;
					break;
				default: 
					System.out.println("Geçersiz işlem! Lütfen Tekrar Deneyiniz.");
			}
		}
		scan.close();

	}

}
