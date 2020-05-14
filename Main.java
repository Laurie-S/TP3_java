import java.util.*;
import java.util.Collections;

public class Main {
	public static void main(String[] args){
		Cours cours1 = new Cours("abcd", "Electronique", 30);
		Cours cours2 = new Cours("efgh", "Informatique", 25);
		Cours cours3 = new Cours("ijk", "Mathematiques", 40);
		Cours cours4 = new Cours("lmn", "Anglais", 20);
		Cours cours5 = new Cours("opq", "Managment", 15);
		Cours cours6 = new Cours("rst", "Java", 26);
		Cours cours7 = new Cours("uvw", "projet", 12);
		
		ArrayList<Cours >listeCours = new ArrayList<Cours> ();
		
		listeCours.add(cours1);
		listeCours.add(cours2);
		listeCours.add(cours3);
		listeCours.add(cours4);
		listeCours.add(cours5);
		listeCours.add(cours6);
		listeCours.add(cours7);
		
		Formation ingenieur = new Formation("xyz", "Ingenieur", listeCours);
		ingenieur.toString();
		
		listeCours = ingenieur.getListeCours();
		listeCours.remove(1);
		ingenieur.setListeCours(listeCours);
		System.out.println(ingenieur);
		System.out.println("deuxième cours " + (ingenieur.getListeCours()).get(1));
		
		
		
		Collections.sort(ingenieur.getListeCours());
		
		System.out.println(ingenieur);
		
	}

}
