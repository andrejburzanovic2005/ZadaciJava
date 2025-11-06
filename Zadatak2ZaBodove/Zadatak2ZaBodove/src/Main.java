public class Main {
    public static void main(String[] args) {
        Restoran r = new Restoran("Forum Restoran", "Ulica Andreja Perica, Podgorica", "020423700");

        Konobar k1 = new Konobar(1, "Andrej", "Jovanovic", 5, 30, 8);
        Kuvar ku1 = new Kuvar(2, "Mirko", "Jankovic", 8, 38);
        Menadzer m1 = new Menadzer(3, "Maja", "Burzanovic", 7, 45, 210);
        Konobar k2 = new Konobar(4, "Stefan", "Novovic", 5.6, 20, 0);
        Kuvar ku2 = new Kuvar(5, "Petar", "Malikovic", 7.5, 44);

        r.dodajZaposlenog(k1);
        r.dodajZaposlenog(ku1);
        r.dodajZaposlenog(m1);
        r.dodajZaposlenog(k2);
        r.dodajZaposlenog(ku2);

        m1.setBonus(250.0);
        k2.setPrekovremeniSati(2.0);

        r.generisiMjesecniObracun(11, 2025);

        double ukupno = r.ukupniTrosakZaMjesec(11, 2025);
        System.out.printf("\nUkupan trosak koji metoda vraca: %.2f EUR\n", ukupno);
    }
}
