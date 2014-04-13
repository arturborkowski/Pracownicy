
public class Stypendysta extends Student {
	
	private int kwotaStypendium;

	public Stypendysta() {
		super();
	}
	
	public Stypendysta(String imie, String nazwisko, int rokUrodzenia, String plec, int kwotaStypendium) {
		super(imie, nazwisko, rokUrodzenia, plec);
		this.kwotaStypendium = kwotaStypendium;
	}
	
	public int getKwotaStypendium() {
		return kwotaStypendium;
	}

	public void setKwotaStypendium(int kwotaStypendium) {
		this.kwotaStypendium = kwotaStypendium;
	}

	
	public String toString() {
		return "Stypendysta [kwotaStypendium=" + kwotaStypendium + "]";
	}
	
	

}
