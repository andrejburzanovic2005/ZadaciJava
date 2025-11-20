
public class drugi {

	public static void main(String[] args) {
		public static AutoDio[] izdvojiDioIzOpsega(AutoDio[] dijelovi, String serijskiOd, String serijskiDo) {

		    // Privremena lista za rezultate

		    java.util.List<AutoDio> rezultat = new java.util.ArrayList<>();
		    for (AutoDio dio : dijelovi) {
		        String serijski = dio.getSerijskiBroj();
		        // Provjera da li je serijski broj između zadatih granica (leksički)
		        if (serijski.compareTo(serijskiOd) >= 0 && serijski.compareTo(serijskiDo) <= 0) {

		            rezultat.add(dio);

		        }

		    }
		    // Pretvaranje liste u niz
		    return rezultat.toArray(new AutoDio[0]);

		}
	}

}
