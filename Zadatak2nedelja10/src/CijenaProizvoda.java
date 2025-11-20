import java.util.Scanner;

public class CijenaProizvoda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double price = 0.0;

        while (true) {
            System.out.print("Unesite cijenu proizvoda: ");
            String line = sc.nextLine();
            try {
                if (line == null || line.trim().isEmpty()) {
                    throw new NumberFormatException("Prazan unos");
                }

                line = line.trim().replace(',', '.');

                double value = Double.parseDouble(line);

                if (value <= 0) {  
                    throw new IllegalArgumentException("Cijena mora biti pozitivan broj veci od nule.");
                }

                price = value;
                break; 

            } catch (NumberFormatException e) {
                System.out.println("Neispravan format broja. Molim unesite broj (npr. 12.50).\n");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage() + " Molim unesite ponovo.\n");
            }
        }

        System.out.printf("Cijena prihvacena: %.2f%n", price);
        sc.close();
    }
}
