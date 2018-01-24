package fr.comptecourant;

import java.security.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Operation {

	int montant;
	String type, date; 
	
	
	
public Operation(int montant, String type, String date) {
		super();
		this.montant = montant;
		this.type = type;
		this.date = date;
	}

public static void Retrait(int somme, ComptePrincipal compte){
		int solde = compte.getSolde();
		
		if (solde >= somme)
			{
			  compte.setSolde(solde-somme);
			  System.out.println("Vous avez retiré " + somme + "euros et votre solde est: " + compte.getSolde());
			  String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
			  Operation log = new Operation(somme, "Retrait", timeStamp);
			  compte.getHistorique().add(log);
			}
		else {
				System.out.println("Vos fonds sont insuffisants");
			}
		
	
		}
	
	public static void Depot(int somme, ComptePrincipal compte){
			  
		int solde = compte.getSolde();
		compte.setSolde(solde+somme);
		System.out.println("Vous avez déposé " + somme + "euros et votre solde est: " + compte.getSolde());
		String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		Operation log = new Operation(somme, "Depôt", timeStamp);
		compte.getHistorique().add(log);
		}
}
