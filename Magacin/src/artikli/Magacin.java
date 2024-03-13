package artikli;

import java.util.ArrayList;
import java.util.List;

import magacin.interfejs.MagacinInterface;

public class Magacin implements MagacinInterface {
	List<Artikal> artikli=new ArrayList<>();
	@Override
	public void dodajArtikal(Artikal a) {
		if(artikli.contains(a)) {
			for(Artikal artikal:artikli) {
				if(artikal.equals(a)) {
					artikal.setKolicina(artikal.getKolicina()+1);
					return;
				}
			}
		}
		artikli.add(a);
		
	}

	@Override
	public void izbaciArtikal(Artikal a) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pronadjiArtikal(Artikal a) {
		// TODO Auto-generated method stub
		
	}
	
}
