import java.util.Scanner;



public class UnijaNizova {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // Unos niza X

        System.out.print("Unesite broj elemenata niza X: ");

        int n = sc.nextInt();

        int[] X = new int[n];

        System.out.println("Unesite elemente niza X:");

        for (int i = 0; i < n; i++) {

            X[i] = sc.nextInt();

        }
        // Unos niza Y

        System.out.print("Unesite broj elemenata niza Y: ");

        int m = sc.nextInt();

        int[] Y = new int[m];

        System.out.println("Unesite elemente niza Y:");

        for (int i = 0; i < m; i++) {

            Y[i] = sc.nextInt();
        }
        // Koristimo Set da uklonimo duplikate i formiramo uniju

        Set<Integer> unija = new TreeSet<>(); // TreeSet automatski sortira u rastućem redoslijedu

        for (int broj : X) {

            unija.add(broj);
        }
        for (int broj : Y) {

            unija.add(broj);
        }
        // Pretvaranje u niz radi ispisa (nije nužno, ali ljepše za prikaz)

        int[] Z = new int[unija.size()];

        int i = 0;

        for (int broj : unija) {

            Z[i++] = broj;

        }
        // Ispis rezultata

        System.out.print("Niz Z = (");

        for (int j = 0; j < Z.length; j++) {

            System.out.print(Z[j]);

            if (j < Z.length - 1) System.out.print(", ");
        }
        System.out.println(")");
    }

}



