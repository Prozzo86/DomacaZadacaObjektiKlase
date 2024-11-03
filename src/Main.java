public class Main {
    /*
    Zadatak: kreirati klasu polaznik, koja ima ime, prezime, dob i spol.

    Kreirajte jednog polaznika koji ima samo ime i prezime, drugi polaznik mora imati sve vrijednosti propertia (varijabli)
    te treci polaznik nema niti jednu vrijednost varijabli.

    Nakon kreiranja prva tri polaznika, ispisati ime i prezime zajedno od prvog polaznika,
    drugom polazniku promjeniti dob, trecem polazniku treba postaviti ime i prezime(posebno ime i posebno prezime).
    */

    public static void main(String[] args) {

        Polaznik polaznik1 = new Polaznik("Marko", "Marković");

        Polaznik polaznik2 = new Polaznik("Pero", "Perić", 34, 'M');
        polaznik2.setDob(23);

        Polaznik polaznik3 = new Polaznik();
        polaznik3.setIme("Ana");
        polaznik3.setPrezime("Anić");

        System.out.println("Prvi polaznik iz klase Polaznik: " + polaznik1.getIme() + " " + polaznik1.getPrezime());
        System.out.println("Drugi polaznik iz klase Polaznik: " + polaznik2.getIme() + " " + polaznik2.getPrezime() + " " + polaznik2.getDob() + " " + polaznik2.getSpol());
        System.out.println("Treći polaznik iz klase Polaznik: " + polaznik3.getIme() + " " + polaznik3.getPrezime());

    }
}