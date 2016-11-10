import it.alfasoft.francesca.bean.Prodotto;
import it.alfasoft.francesca.bean.Ristorante;
import it.alfasoft.francesca.dao.RistoranteDao;

public class MainProva {

	public static void main(String[] args) {
	
	Ristorante r= new Ristorante("Ristorante");
	Prodotto p=new Prodotto("Penne all'arrabbiata",3.50);
	
	r.addPrimo(p);
	
	RistoranteDao rdao= new RistoranteDao();
	rdao.aggiornaRistorante(r);
	
	}
}
