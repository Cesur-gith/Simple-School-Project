package OkulProject;

import java.util.Scanner;

public class Depo {

    static Scanner scan = new Scanner(System.in);
    public static void anaMenu() throws InterruptedException {

        String tercih = "";

        do {
            System.out.println("Yildiz Koleji \n" + "ANA MENU" +

                    "\n" +
                    "\t 1- Okul bilgileri Goruntule \n" +
                    "\t 2- Ogretmen Menu \n" +
                    "\t 3- Ogrenci Menu \t\t \n" +
                    "\t Q- Cikis \n");

            System.out.println("Lutfen Menuden Tercihinizi yapiniz");
            tercih=scan.nextLine();

            switch (tercih){
                case "1": // Okul Bilgiler
                    Depo.okulBilgileriniYazdir();
                    break;
                case "2": //Ogretmen menusu
                    Ogretmen.ogretmenMenu();
                    break;
                case "3": //Ogrenci menusu
                    break;
                case "q": //Ogretmen menusu
                case "Q":
                    break;
                default:
                    System.out.println("Lutfen gecerli bir tercih giriniz");

            }

        } while (!tercih.equalsIgnoreCase("q") );

        Depo.projeDurdur(); // Depo klasindan proje durdur

    }

    public static void okulBilgileriniYazdir() throws InterruptedException {

        System.out.println("Yildiz Koleji \n" +
                "\t\t Address: " + Okul.address +
                "\n\t\t Telefon: " + Okul.telefon);
        Thread.sleep(5000);
    }

    public static void projeDurdur() {
    }
}
