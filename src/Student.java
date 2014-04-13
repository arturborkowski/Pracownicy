
public class Student extends Osoba {
	
	private int numerIndeksu;

	
	public Student() {
		super();
	}
	
	public Student(String imie, String nazwisko, int rokUrodzenia, String plec, int numerIndeksu) {
		super(imie, nazwisko, rokUrodzenia, plec);
		this.numerIndeksu = numerIndeksu;
	}
	
	public Student(String imie, String nazwisko, int rokUrodzenia, String plec) {
		this(imie, nazwisko, rokUrodzenia, plec, 0);
	}

	
	public int getNumerIndeksu() {
		return numerIndeksu;
	}

	public void setNumerIndeksu(int numerIndeksu) {
		this.numerIndeksu = numerIndeksu;
	}


	public String toString() {
		return "Student [numerIndeksu = " + numerIndeksu + ", imie = " + imie
				+ ", nazwisko =" + nazwisko + ", rokUrodzenia = " + rokUrodzenia
				+ ", plec = " + plec + "]";
	}

	
	
	
	

}
