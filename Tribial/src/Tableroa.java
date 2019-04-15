import proiektua.Tableroa;

public class Tableroa {
	
	private HasierakoBideak hasierakoBideak;
	private BigarrenBidea bigarrenBidea;
	private Jokalaria[] listaJokalariak;
	private int jokalariKop=0;
	private static Tableroa nireTableroa=null;
	
	private Tableroa(){
		hasierakoBideak=new HasierakoBideak();
		bigarrenBidea=new BigarrenBidea();
		listaJokalariak=new Jokalaria[6];
	}
	public Tableroa getTableroa(){
		if(nireTableroa==null){
			nireTableroa=new Tableroa();
		}
		return nireTableroa;
	}
	public void gehituJokalaria(Jokalaria pJokalaria){
		this.listaJokalariak[this.jokalariKop]=pJokalaria;
		jokalariKop++;
	}
	public void partidaBatJolastu(){
		int i=0;
		while(!this.partidaBukatuDa(i)){
			listaJokalariak[i].mugituFitxa();
			if (this.partidaBukatuDa(i)){
				String irabazlea=listaJokalariak[i].getKolorea();
				System.out.println("Irabazlea jokalari" + irabazlea + " da");
			}
			i++;
			if (i>=this.jokalariKop){
				i=0;
			}
		}
	}
	private boolean partidaBukatuDa(int pIndizea){
		return listaJokalariak[pIndizea].partidaBukatuDa();
	}
	
	public void setJokalariKop(int pJokalariKop){
		this.jokalariKop=pJokalariKop;
	}
	
	private void partidaHasieratu() {
		//TODO adibidez ezarri jokalari kop, hasieratu zerrenda guztiak etab
	}
	
	public static void main(String args[]){
		Tableroa.getNireTableroa().partidaBatJolastu();
	}
	
}
