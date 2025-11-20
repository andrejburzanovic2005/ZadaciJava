
public class drugi {

	public static void main(String[] args) {
		public static AutoDio[] izdvojiDioIzOpsega(AutoDio[] dijelovi, String serijskiOd, String serijskiDo) {

		    

		    java.util.List<AutoDio> rezultat = new java.util.ArrayList<>();
		    for (AutoDio dio : dijelovi) {
		        String serijski = dio.getSerijskiBroj();
		        
		        if (serijski.compareTo(serijskiOd) >= 0 && serijski.compareTo(serijskiDo) <= 0) {

		            rezultat.add(dio);

		        }

		    }
		   
		    return rezultat.toArray(new AutoDio[0]);

		}
	}

}
