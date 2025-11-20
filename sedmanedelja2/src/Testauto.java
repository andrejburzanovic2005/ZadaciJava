import java.util.ArrayList;

class Auto {
	private String markaAuta;
	private int godisteAuta;
	private float snagaMotora;
	private boolean prodato;
	private float kubikaza;
	private boolean registrovan;
	private static int brojProdatih = 0;
	
	public Auto(String markaAuta, int godisteAuta, float snagaMotora,
			boolean prodato, float kubikaza, bolean registrovan) {
		this.markaAuta = markaAuta;
		this.godisteAuta = godisteAuta;
		this.snagaMotora = snagaMotora;
		this.prodato = prodato;
		this.kubikaza = kubikaza;
		if (prodato) brojProdatih++;
		this.registrovan = godisteAuta < 1985 ? false : registrovan;
	}
    
	public String getMarkaAuta() {
		return markaAuta;		
	}
	public void setMarkaAuta(String markaAuta) {	
		this.markaAuta = markaAuta;
	}
	public int getGodisteAuta() {
		return godsiteAuta;
	}
	public void setGodisteAuta(int godisteAuta) {
		if (godisteAuta >= 2025) {
			System.out.print("jos nijesmo stigli do te godine");
			return;
		}
		this.godisteAuta = godisteAuta;
		if (godisteAuta < 1985) this.registrovan = false;
	}
	
	public float getSnagaMotora( ) {
		return this.snagaMotora;
	}
	
	public void setSnagaMotora(float snagaMotora) {
		this.snagaMotora = snagaMotora;
	}
	
	public boolean jeProdato() {
		return this.prodato;
		
	}
	
	public void setProdato(boolean prodato) {
		if (this.prodato != prodato && prodato) brojprodatih++;
		this.prodato = prodato;
	}
	public float getKubikazaMotora() {
		return this.kubikaza = kubikaza;
	}
	
	public void setKubikazaMotora(float  KubikazaMotora) {
	
	}

}

public class Testauto {

	public static void main(String[] args) {
		ArrayList<Auto> auto = new ArrayList<>();
		auta.add(new Auto("VW Golf 3", 1995, 55, true, 1600, false));
		auto.add(new.Auto("BMW 320d", 2020, 140, true, 1995, true));
		System.out.print(auta.get(0));

	}

}
