package OkulProject;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Ogretmen {

    static Scanner scan = new Scanner(System.in);
    static Map<String, String> ogretmenlerMap = new HashMap<>();

    public static void fakeOgretmenlerEkle() {
        ogretmenlerMap.put("123456987411","Ali, Can, 1980, Matematik");
        ogretmenlerMap.put("123456987412","Veli, Yan, 1981, Fizik");
        ogretmenlerMap.put("123456987413","Ayse, Can, 1982, Kimya");
        ogretmenlerMap.put("123456987414","Ali, San, 1983, Kimya");
        ogretmenlerMap.put("123456987415","Alp, Yan, 1984, Matematik");
    }



    public static void ogretmenMenu() throws InterruptedException {
        String tercih = "";

        do {

            System.out.println("Yildiz Koleji \n" +
                    "Ogretmen Menu \n " +
                    "\n" +
                    "\t 1 - Ogretmnelr Listesi Yazdir \t\t" +
                    "\t 2 - Soyisimden Ogretmen Bulma \n" +
                    "\t 3 - Branstan Ogretmen Bulma  \n" +
                    "\t 4 - Bilgilerini girerek Ogretmen Ekleme  \n" +
                    "\t 5 - Kimlik No ile  Kayit silme  \n" +
                    "\t A - AnaMenu \n" +
                    "\t Q - Cikis  \n");
            tercih= scan.nextLine();

            switch (tercih) {
                case "1": // Ogretnmenler Listesi Yazdir
                    ogretmenListesiYazdir();
                    break;
                case "2": //Soyisimden Ogretmen Bulma
                    soyisimdenOgretmenBulma();
                    break;
                case "3":// Branstan Ogretmen Bulma
                    bransdanOgretmenBulma();
                    break;
                case "4": //Bilgilerini girerek Ogretmen Ekleme
                    ogretmenEkleme();
                    break;
                case "5": // Kimlik No ile  Kayit silme
                    tcNoileOgretmenSil();
                    break;
                case "a":
                case "A":
                    Depo.anaMenu();
                    break;
                case "q":
                case "Q":
                    break;
                default:
                    System.out.println("Lutfen gecerli bir tercih giriniz");

            }


        } while (!tercih.equalsIgnoreCase("q"));
        Depo.projeDurdur();

    }

    public static void tcNoileOgretmenSil() {

        System.out.println("Silinecek ogretmen kimlik no iriniz");
        String silinecekOgretmen = scan.nextLine();

        String silinecekValue = ogretmenlerMap.get(silinecekOgretmen);

        String sonucValue = ogretmenlerMap.remove(silinecekOgretmen);

        try {
            boolean sonuc =  sonucValue.equals(silinecekValue);
        } catch (Exception e) {
            System.out.println("Verilen kimlik no ile ogretmen bulunamadi");
        }

    }

    public static void ogretmenEkleme() {
        System.out.println("Tc No");
        String tcNo = scan.nextLine();

        System.out.println("Isim");
        String isim = scan.nextLine();
        System.out.println("Soyisim");
        String soyisim = scan.nextLine();
        System.out.println("Dogum Yili");
        String dYili = scan.nextLine();
        System.out.println("Brans");
        String brans = scan.nextLine();

        String eklenecekValue= isim + ", " + soyisim+ ", " +dYili+ ", " +brans;
        ogretmenlerMap.put(tcNo, eklenecekValue);
    }

    public static void bransdanOgretmenBulma() throws InterruptedException {

        System.out.println("Aradiginiz ogretmenin bransini giriniz");
        String istenenSoyisim = scan.nextLine();

        Set<Map.Entry<String, String>> ogretmenEntrySet = ogretmenlerMap.entrySet();

        System.out.println("Yildiz Koleji \n" +
                "Brans ile Ogretmen Arama \n " +
                "TcNo      Isim   Soyisim   D.Yili   Brans ");


        for (Map.Entry<String, String> each : ogretmenEntrySet
        ) {

            String eachKey = each.getKey();
            String eachValue = each.getValue();

            String eachValuearr[] = eachValue.split(", ");
            if (istenenSoyisim.equalsIgnoreCase(eachValuearr[3])) {
                System.out.printf("%11s %-6s   %-8s %4s   %s   \n",  eachKey, eachValuearr[0], eachValuearr[1],
                        eachValuearr[2], eachValuearr[3]);
            }
        }
        Thread.sleep(5000);
    }

    public static void soyisimdenOgretmenBulma() throws InterruptedException {
        System.out.println("Aradiginiz ogretmenin soyismini giriniz");
        String istenenSoyisim = scan.nextLine();

        Set<Map.Entry<String, String>> ogretmenEntrySet = ogretmenlerMap.entrySet();

        System.out.println("Yildiz Koleji \n" +
                "Soyisim ile Ogretmen Arama \n " +
                "TcNo      Isim   Soyisim   D.Yili   Brans ");


        for (Map.Entry<String, String> each : ogretmenEntrySet
        ) {

            String eachKey = each.getKey();
            String eachValue = each.getValue();

            String eachValuearr[] = eachValue.split(", ");
            if (istenenSoyisim.equalsIgnoreCase(eachValuearr[1])) {
                System.out.printf("%11s %-6s %-8s %4s %s \n" + eachKey, eachValuearr[0], eachValuearr[1], eachValuearr[2], eachValuearr[3]);

            }

        }

        Thread.sleep(5000);


    }




    public static void ogretmenListesiYazdir() throws InterruptedException {

        Set<Map.Entry<String, String>> ogretmenEntrySet = ogretmenlerMap.entrySet();

        System.out.println("Yildiz Koleji \n" +
                "Ogretmen Listesi \n " + "TcNo      Isim   Soyisim   D.Yili   Brans ");


        for (Map.Entry<String, String> each : ogretmenEntrySet
        ) {

            String eachKey = each.getKey();
            String eachValue = each.getValue();

            String eachValuearr[] = eachValue.split(", ");
            System.out.printf("%11s %-6s %-8s %4s %s \n" + eachKey, eachValuearr[0], eachValuearr[1], eachValuearr[2], eachValuearr[3]);


        }

        Thread.sleep(5000);
    }
}