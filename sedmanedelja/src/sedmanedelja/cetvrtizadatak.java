package sedmanedelja;
import java.util.Scanner;

public class cetvrtizadatak {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
        String rijec = sc.nextLine().toLowerCase();

        int brojSamoglasnika = 0;
        int brojSuglasnika = 0;

        for (int i = 0; i < rijec.length(); i++) {
            char znak = rijec.charAt(i);

            if (Character.isLetter(znak)) { 
                if (znak == 'a' || znak == 'e' || znak == 'i' || znak == 'o' || znak == 'u') {
                    brojSamoglasnika++;
                } else {
                    brojSuglasnika++;
                }
            }
        }

        System.out.println("Broj samoglasnika: " + brojSamoglasnika);
        System.out.println("Broj suglasnika: " + brojSuglasnika);
    }
}

	}

}
