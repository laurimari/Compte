package fr.comptecourant;

import java.util.LinkedList;

public class ComptePrincipal {
	
	int solde;
	
	LinkedList<Operation> historique = new LinkedList<Operation>();


	public int getSolde() {
		return solde;
	}

	public void setSolde(int solde) {
		this.solde = solde;
	}

	public LinkedList<Operation> getHistorique() {
		return historique;
	}

	public ComptePrincipal() {
		super();
		this.solde = 0;
		this.historique = historique;
	}

	
	
	
	
}
