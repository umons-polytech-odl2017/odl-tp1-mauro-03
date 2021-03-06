package exercise1;

import java.util.Scanner;

public class Exercise1 {
	static Person createPerson(String name, int age) {
		// Ajoutez les champs name et age à la classe Person.
		// Créez un constructeur public permettant d'initialiser ces valeurs au moment de la construction.
		// Créez des getters publics pour lire ces valeurs une fois la classe construite.
		return new Person(name,age);
	}

	public static void main(String[] args) {
		// Considérant que cette classe est démarrée en ligne de commande avec un premier paramètre donnant le nom
		// et un second donnant l'âge (nombre entier), créez un objet Person sur base de ceux-ci.
		Person person;
		int age, age1;
		String name, name1;

		name = args[0];
		age= Integer.parseInt(args[1]);

		person= createPerson(name, age);

		age1=person.getAge();
		name1=person.getName();

		System.out.println(age1);
		System.out.println(name1);


		// Ecrivez ensuite le nom et l'âge de cette personne sur la sortie standard.

	}
}
