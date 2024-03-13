package magacin.interfejs;

import java.util.ArrayList;
import java.util.List;

import artikli.Artikal;

public interface MagacinInterface {
		
	public void dodajArtikal(Artikal a) ;
	public void izbaciArtikal(Artikal a);
	public Artikal pronadjiArtikal(int sifra);
}
