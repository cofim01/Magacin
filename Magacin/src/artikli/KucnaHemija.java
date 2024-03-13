package artikli;

import java.time.LocalDate;
import java.util.Objects;


public class KucnaHemija extends Artikal {
	private LocalDate rokTrajanja;
	
	public LocalDate getRokTrajanja() {
		return rokTrajanja;
	}
	public void setRokTrajanja(LocalDate rokTrajanja) {
		
		this.rokTrajanja = rokTrajanja;
	}
	@Override
	public int hashCode() {
		return Objects.hash(kolicina, naziv, opis, rokTrajanja, sifra);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		KucnaHemija other = (KucnaHemija) obj;
		return kolicina == other.kolicina && Objects.equals(naziv, other.naziv) && Objects.equals(opis, other.opis)
				&& Objects.equals(rokTrajanja, other.rokTrajanja) && sifra == other.sifra;
	}
	@Override
	public String toString() {
		return "KucnaHemija [naziv=" + naziv + ", sifra=" + sifra + ", opis=" + opis + ", kolicina=" + kolicina
				+ ", rokTrajanja=" + rokTrajanja + "]";
	}
	
	
	
	
}
