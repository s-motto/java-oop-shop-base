package org.lessons.java.shop;

public class Prodotto {
	
	double codice;
	String nome;
	String descrizione;
	float prezzo;
	int iva;
	
	//numero random
	double codiceRandom() {
		return Math.floor(Math.random()* (9000- 1000 + 1) + 1000 );
	}
	
	//trasformo double in int per eliminare il .0 finale
	int codiceFinale=(int) codiceRandom();
	
	//calcolo prezzo finale
	float prezzoPiuIva() {
		float percentuale=prezzo*iva;
		return prezzo+percentuale;
	}
	
	float prezzoFinale=prezzoPiuIva();
	
	Prodotto(double codice, String nome, String descrizione, float prezzo, int iva){
		this.codice= codiceRandom();
		this.nome=nome;
		this.descrizione=descrizione;
		this.prezzo=prezzo;
		this.iva=iva;
				
	};
	
	//stringa con le info del prodotto
	String infoProdotto(){
		return "Codice "+codiceFinale+", "+nome+", "+descrizione+", "+ prezzo+"euro, iva al "+iva+"%"+". Prezzo finale: "+prezzoFinale;
	};
		
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		//lista prodotti
		Prodotto pasta= new Prodotto(0000, "Mezze penne Barilla", "Mezze penne rigate, da grano italiano", 2.45f, 20);
		Prodotto uova= new Prodotto(0000, "Uova Esselunga, 6pz", "uova da galline allevate a terra", 3.22f, 10);
		Prodotto salsaChilli= new Prodotto(0000, "Sweet Chilli Sauce Go-Tan", "salsa di peperoncino chili dolce", 4.76f,22);		
		
		
		System.out.println(pasta.infoProdotto());
		System.out.println(uova.infoProdotto());
		System.out.println(salsaChilli.infoProdotto());
	}

}
