package fr.comptecourant;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ComptePrincipal compte = new ComptePrincipal();
		Scanner keyboard = new Scanner(System.in);
		String choix;
		
		do {
		
		System.out.println("Selectionez une operation:");
		System.out.println("a. Consulter l'historique");
		System.out.println("b. Retrait");
		System.out.println("c. Depôt");
		System.out.println("a. Consulter le solde");
		System.out.println("d. Sortir");
		System.out.println();
		
		choix = keyboard.next();
		
		switch (choix) {
        case "a":
        	System.out.println(compte.getHistorique().toString());
            break;
        case "b":
        	System.out.println("Introduissez la somme");
        	choix = keyboard.next();
        	        	
        	try
            {
        		 int sommer = Integer.parseInt(choix);
        		 Operation.Retrait(sommer, compte);
            }
            catch (NumberFormatException nfe)
            {
              System.out.println("Votre choix est incorrect. Veuillez introduire un multiple de 5");
            }
        	
            
            break;
        case "c":
        	System.out.println("Introduissez la somme");
        	choix = keyboard.next();
        	
        	try
            {
        	int sommed = Integer.parseInt(choix);
            Operation.Depot(sommed, compte);
            }
            catch (NumberFormatException nfe)
            {
              System.out.println("Votre choix est incorrect. Veuillez introduire un multiple de 5");
            }
            break;
        case "d":
            System.out.println(compte.getSolde());
            break;
        default:
            System.out.println("Choix non valable\n");
            break;
    }
		
		}
		while (!choix.equals("d"));

		
	}

}
