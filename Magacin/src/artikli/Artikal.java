package artikli;

import java.util.Objects;

public class Artikal {
	protected String naziv;
	protected int sifra;
	protected String opis;
	protected int kolicina;
	protected String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		if(naziv==null) {
			throw new NullPointerException("Naziv ne sme biti null");
		}
		this.naziv = naziv;
	}
	public int getSifra() {
		return sifra;
	}
	public void setSifra(int sifra) {
		if(sifra<0) {
			throw new IllegalArgumentException("Sifra ne sme biti manja od nule");
		}
		this.sifra = sifra;
	}
	public String getOpis() {
		return opis;
	}
	public void setOpis(String opis) {
		if(opis==null) {
			throw new NullPointerException("Opis ne sme biti null");
		}
		this.opis = opis;
	}
	public int getKolicina() {
		return kolicina;
	}
	public void setKolicina(int kolicina) {
		if(kolicina<0) {
			throw new IllegalArgumentException("Kolicina ne sme biti manja od 0");
		}
		this.kolicina = kolicina;
	}
	@Override
	public int hashCode() {
		return Objects.hash(kolicina, naziv, opis, sifra);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		KancelarisjkiMaterijal other = (KancelarisjkiMaterijal) obj;
		return kolicina == other.kolicina && Objects.equals(naziv, other.naziv) && Objects.equals(opis, other.opis)
				&& sifra == other.sifra;
	}
	@Override
	public String toString() {
		return "KancelarisjkiMaterijal [naziv=" + naziv + ", sifra=" + sifra + ", opis=" + opis + ", kolicina="
				+ kolicina + "]";
	}
}
