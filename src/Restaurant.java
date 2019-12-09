
/*FASE 1 (2 punts)
● Creeu una variable int per cada un dels bitllets que existeixen des de 5€ a 500€, haureu de crear un altre
variable per guardar el preu total del menjar. (1 punt)
● Creeu dos arrays, un on guardarem el menú (5 plats) i un altre on guardarem el preu de cada
plat. (1 punt)
FASE 2 (3 punts)
● Amb un bucle for haurem d’omplir els dos arrays anteriorment creats. Afegirem el nom del plat i després
el preu. (1 punt)
● Un cop plens els dos arrays haurem de mostrar-los i preguntar que es vol per menjar, guardarem la
informació en una List fent servir un bucle while. (1 punt)
● Haurem de preguntar si es vol seguir demanant menjar. Podeu fer servir el sistema (1:Si / 0:No), per tant
haureu de crear un altre variable int per guardar la informació. (1 punt)
FASE 3 (5 punts)
● Un cop hem acabat de demanar el menjar, haurem de comparar la llista amb l’array que hem fet al
principi. En el cas que la informació que hem introduït a la List coincideixi amb la del array, haurem de
sumar el preu del producte demanat; en el cas contrari haurem de mostrar un missatge que digui que el
producte que hem demanat no existeix.
 */

import java.util.*;

public class Restaurant {

	public static void main(String[] args) {

		int plate = 0, cinc = 5, deu = 10, vint = 20, cinquanta = 50, cent = 100, cinccents = 500, total = 0;
		// String [] menu= {"Sopa","Ensalada","Entremes","Carn","Peix"};
		// int[] prices = new int[5];
		Integer[] prices = { 7, 8, 8, 10, 11 };
		List<String> menu = new ArrayList<String>(); // Utilitzada llista per tal de utilizar el mètode indexOf
		menu.add("sopa");
		menu.add("ensalada");
		menu.add("entremes");
		menu.add("carn");
		menu.add("peix");
		List<String> order = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);

		System.out.println("El menú són 5 plats, si us plau ,introduiu el plat (INTRO) i"
				+ " seguidament preu del plat (INTRO): ");

		// for (int i = 0; i < 5; i++) { menu.add(sc.next()); prices[i] = sc.nextInt();}

		System.out.println("Menu del dia ");

		for (int i = 0; i < 5; i++) {
			System.out.println(menu.get(i) + " " + prices[i] + "€");
		}
		System.out.println("Que voldrà per menjar? ");

		int temp = 1;

		while (temp == 1) {
			order.add(sc.next());
			System.out.println("Voleu demanar més menjar? '1'-SÍ '0'-NO ");
			temp = sc.nextInt();
		}

		for (int j = 0; j < menu.size(); j++) {
			if (order.contains(menu.get(j))) {

				System.out.println(menu.get(j));
				total += prices[j];
			}
		}
		for (int k = 0; k < order.size(); k++) {
			plate = menu.indexOf(order.get(k));
			if (plate == -1) {
				System.out.println(order.get(k) + " :el plat no existeix al menu");

			}
		}

		System.out.println("Total del menu: " + total + " €");
	}
}
