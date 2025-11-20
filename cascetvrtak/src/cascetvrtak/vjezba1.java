package cascetvrtak;
import java.util.Scanner;

public class vjezba1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		
		double P = a*b;
		double O = 2*a+2*b;
		
		System.out.printf("povrsina i obim pravougaonika su:            ",P,O);

	}

}
