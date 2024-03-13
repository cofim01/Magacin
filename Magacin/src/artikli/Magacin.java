package artikli;

import java.util.ArrayList;
import java.util.List;

import magacin.interfejs.MagacinInterface;

public class Magacin implements MagacinInterface {
	List<Artikal> artikli=new ArrayList<>();
	
	@Override
	public void dodajArtikal(Artikal a) {
		for(Artikal artikal:artikli) {
			if(a.equals(artikal)) {
				a.setKolicina(a.getKolicina()+1);
				return;
			}
		}
		artikli.add(a);
		
	}

	@Override
	public void izbaciArtikal(Artikal a) {
		for(Artikal artikal:artikli) {
			if(a.equals(artikal)) {
				a.setKolicina(a.getKolicina()-1);
				return;
			}
		}
		artikli.remove(a);
		
	}

	@Override
	public Artikal pronadjiArtikal(int sifra) {
		for(Artikal artikal:artikli) {
			if(artikal.getSifra()==sifra) {
				return artikal;
			}
		}
		return null;
		
	}
	
}
