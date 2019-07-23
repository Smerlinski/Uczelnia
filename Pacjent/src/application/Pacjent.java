package application;

import java.util.Comparator;

public class Pacjent {
	private String imie;
	private String nazwisko;
	private int wiek;
	private int id;

	public Pacjent(String imie, String nazwisko, int wiek, int id) {
		this.imie=imie;
		this.nazwisko=nazwisko;
		this.wiek=wiek;
		this.id=id;
		
	}
	public String getImie() {
        return imie;
   }
   public void setImie(String imie) {
	this.imie = imie;
   }
   public String getNazwisko() {
	return nazwisko;
   }
   public void setNazwisko(String nazwisko) {
	this.nazwisko = nazwisko;
   }
   public int getWiek() {
	return wiek;
   }
   public void setWiek(int wiek) {
	this.wiek = wiek;
   }
   public int getId() {
		return id;
   }
   public void setId(int id) {
		this.id = id;
   }
   
   public static Comparator<Pacjent> PorownanieImienia = new Comparator<Pacjent>() {

		public int compare(Pacjent p1, Pacjent p2) {
		   String ImiePacjenta1 = p1.getImie().toUpperCase();
		   String ImiePacjenta2 = p2.getImie().toUpperCase();
		   return ImiePacjenta1.compareTo(ImiePacjenta2);

	    }};
	    
	 public static Comparator<Pacjent> PorownanieNazwiska = new Comparator<Pacjent>() {
	    
		 public int compare(Pacjent p1, Pacjent p2) {
			   String NazwiskoPacjenta1 = p1.getNazwisko().toUpperCase();
			   String NazwiskoPacjenta2 = p2.getNazwisko().toUpperCase();
			   return NazwiskoPacjenta1.compareTo(NazwiskoPacjenta2);

		}};
	   
	  public static Comparator<Pacjent> PorownanieWieku = new Comparator<Pacjent>() {

		public int compare(Pacjent p1, Pacjent p2) {

		   int WiekPacjenta1 = p1.getWiek();
		   int WiekPacjenta2 = p2.getWiek();
		   return WiekPacjenta1-WiekPacjenta2;

	    }};
	    
	    public static Comparator<Pacjent> PorownanieId = new Comparator<Pacjent>() {

			public int compare(Pacjent p1, Pacjent p2) {

			   int IdPacjenta1 = p1.getId();
			   int IdPacjenta2 = p2.getId();
			   return IdPacjenta1-IdPacjenta2;

		    }};
   
   @Override
   public String toString() {
        return ("\n\"Imie\":"+ "\"" + this.getImie()+ "\"" +
                    " \n\"Nazwisko\":"+ "\"" + this.getNazwisko() + "\"" +
                    " \n\"Wiek\":"+ "\"" + this.getWiek() + "\"" + "\n");
   }

}
