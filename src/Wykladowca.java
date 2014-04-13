
public class Wykladowca extends Osoba {
	
	private String tytulNaukowy;
	
	
	public Wykladowca() {
		super();
	}

	public Wykladowca(String imie, String nazwisko, int rokUrodzenia,	String plec, String tytulNaukowy) {
		super(imie, nazwisko, rokUrodzenia, plec);
		this.tytulNaukowy = tytulNaukowy;
		
	}

	
	
	public String getTytulNaukowy() {
		return tytulNaukowy;
	}
	
	public void setTytulNaukowy (String tytulNaukowy) {
		this.tytulNaukowy = tytulNaukowy;
	}


	public String toString() {
		return "Wykladowca: [tytulNaukowy: "+tytulNaukowy+"]";
	}
}
