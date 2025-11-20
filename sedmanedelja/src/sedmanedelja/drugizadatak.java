package sedmanedelja;
import java.util.Scanner;

public class drugizadatak {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String rijeci = sc.nextLine();
		
		rijeci = rijeci.toLowerCase().replaceAll("\\s+", "");
		
		String obrnuto = new StringBuilder(rijeci).reverse().toString();
		
		if (rijeci.equals(obrnuto)) {
			System.out.println("je palindrom");
		} else {
			System.out.println("nije palindrom");

		}
		

	}

}
