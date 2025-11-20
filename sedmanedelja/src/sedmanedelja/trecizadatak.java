package sedmanedelja;

public class trecizadatak {

	public static void main(String[] args) {
		String tekst = "";
        boolean pronadjeno = false;

        for (int i = 0; i < tekst.length() - 1; i++) {
            if (tekst.charAt(i) == tekst.charAt(i + 1)) {
                System.out.println("Prva dva uzastopna ista slova su: " + tekst.charAt(i) + tekst.charAt(i + 1));
                pronadjeno = true;
                break;
            }
        }

        if (!pronadjeno) {
            System.out.println("Nema dva uzastopna ista slova.");

	}

}
