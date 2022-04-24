package OkulProject;

public class _Runner {

    public static void main(String[] args) throws InterruptedException {

        Ogretmen.fakeOgretmenlerEkle();
        Depo.anaMenu();

        // Okul class indan obje olusturulamaz cunku "privte"  access modifier kullanmis
        // Okul obj = new Okul();

    }



}
