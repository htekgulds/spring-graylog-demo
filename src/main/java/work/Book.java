package work;

public class Book {

	private String ad;
	private String yazar;
	private int sayfaSayisi;
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public String getYazar() {
		return yazar;
	}
	public void setYazar(String yazar) {
		this.yazar = yazar;
	}
	public int getSayfaSayisi() {
		return sayfaSayisi;
	}
	public void setSayfaSayisi(int sayfaSayisi) {
		this.sayfaSayisi = sayfaSayisi;
	}
	public Book(String ad, String yazar, int sayfaSayisi) {
		super();
		this.ad = ad;
		this.yazar = yazar;
		this.sayfaSayisi = sayfaSayisi;
	}
	
	
}
