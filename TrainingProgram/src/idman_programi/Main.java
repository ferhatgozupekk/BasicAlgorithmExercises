package idman_programi;

import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		 System.out.println("Idman programimiza hosgeldiniz");
		 
		 String idmanlar= "Gecerli haretekler \n" + "1. Burpee \n" + "2. Pushup \n" + "3. situp  \n" + "4. squat \n";
		 System.out.println(idmanlar);
		 
		 System.out.println("Bir idman olusturun...");
		 System.out.println("burpee sayisi:");
		 int burpee = scanner.nextInt();
		 System.out.println("pushup sayisi:");
		 int pushup = scanner.nextInt();
		 System.out.println("situp sayisi:");
		 int situp = scanner.nextInt();
		 System.out.println("squat sayisi:");
		 int squat = scanner.nextInt();
		 scanner.nextLine();
		 
		 Idman idman = new Idman(burpee, pushup, situp, squat);
		 System.out.println("idmaniniz basliyor.");
		 
		 while (idman.idmanBittiMi() == false) {
			System.out.println("hareket turu (Burpee,Pushup,Situp,Squat):");
			String tur = scanner.nextLine();
			System.out.println("Bu hareketten kac adet yapaciksiniz.");
			int sayi = scanner.nextInt();
			scanner.nextLine();
			idman.hareketYap(tur, sayi);
		}
		 System.out.println("idmaninizi basarili bir sekilde tamamladiniz.");
		 
		 
	}

}
