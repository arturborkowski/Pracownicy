
public abstract class Osoba {
	protected String imie;
	protected String nazwisko;
	protected int rokUrodzenia;
	protected String plec;
	
	
	
	Osoba() {
		this.imie = "N/N";
		this.nazwisko = "N/N";
		this.rokUrodzenia = 0;
		this.plec = "N/N";
	};
	
	Osoba (String imie, String nazwisko, int rokUrodzenia, String plec) {
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.rokUrodzenia = rokUrodzenia;
		this.plec = plec;
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
	public int getRokUrodzenia() {
		return rokUrodzenia;
	}
	public void setRokUrodzenia(int rokUrodzenia) {
		this.rokUrodzenia = rokUrodzenia;
	}
	public String getPlec() {
		return plec;
	}
	public void setPlec(String plec) {
		this.plec = plec;
	}
	
	
	public String toString() {
		return "Osoba [imie=" + imie + ", nazwisko=" + nazwisko
				+ ", rokUrodzenia=" + rokUrodzenia + ", plec=" + plec + "]";
	}
	
	
	

}
