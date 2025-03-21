import java.util.Scanner;
public class ortalamaHesaplama {

	public static double ortalama(double vizeNotu, double finalNotu, double quizOrt) {
		return vizeNotu * 0.3 + finalNotu * 0.6 + quizOrt * 0.1;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("İsminizi Giriniz: ");
		String name = scan.nextLine();
		System.out.println("Hoşgeldin, "+name + "\n" + "Ortalamanızı Hesaplamak için notlarınızı giriniz. \n");
		
		System.out.print("Vize Notunuz: ");
		
        while (!scan.hasNextDouble()) {
            System.out.println("Lütfen geçerli bir sayı girin!");
            scan.next(); 
        }
        
		double vizeNotu = scan.nextDouble();
		
		
		
		System.out.print("Final Notunuzu Giriniz: ");
		
		while (!scan.hasNextDouble()) {
            System.out.println("Lütfen geçerli bir sayı girin!");
            scan.next(); 
        }
		
		double finalNotu = scan.nextDouble();
		System.out.print("Quiz Ortalamanızı Giriniz: ");
		
		while (!scan.hasNextDouble()) {
            System.out.println("Lütfen geçerli bir sayı girin!");
            scan.next();
        }
		
		double quizOrt = scan.nextDouble();
		
		double ortalama = ortalama(vizeNotu, finalNotu, quizOrt);
        if (ortalama >= 50) {
            System.out.println("Tebrikler, " + name + "! Geçtiniz. Ortalamanız: "+ ortalama );
        } else {
            System.out.println("Üzgünüm, "+ name + " kaldınız. Ortalamanız: "+ ortalama);
        }

    	scan.close();
	}
}
