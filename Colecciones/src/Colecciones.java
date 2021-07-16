import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/*
import java.awt.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;*/

public class Colecciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		La coleccion Set no puede contener elementos duplicados 
		solo tiene los metodos heredados de collection
		existen diferentes tipos de implementaciones
		
		HashSet: Esta implementacion almacena los elementos en una tabla hash.
		Es la que mejor rendimiento tiene.
		Los elementos no tienen un orden
		
		HashSet -> solo muestra el contenido sin orden en especifico
		TreeSet  -> ordena por orden alfabetico, preo baja su rendimiento porque los va posicionando en el orden correcto
		LinkedHashSet ->
		
		*/
		/*
		Set<String> frutas = new LinkedHashSet();

		frutas.add("Mango");
		frutas.add("Manzana");
		frutas.add("Durazno");
		frutas.add("Pera");
		frutas.add("Cereza");
		frutas.add("Mandarina");
		frutas.add("Carambola");
		frutas.add("Maracuya");
		frutas.add("Platano");
*/
		/*
		for(String fruta: frutas) {
			System.out.println(fruta);
		}
		*/
		//System.out.println(frutas.contains("Guayaba")); //para buscar si existe Guayaba
		//System.out.println(frutas.size()); 
		/*
		 * la interfaz List define una sucesión de elementos
		 * Si admite elementos duplicados
		 * Añade nuevos metodos que podemos usar
		 * Acceso posicional a elementos: manipula elementos en funcion de su posicion en la lista
		 * Busqueda de elementos: busca un elemento concreto de la lista y devulve
		 * 
		 * Implementaciones:
		 *  arrayList
		 *  LinkedList
		 * */
		
		List<String> frutas2 = new ArrayList<String>();
		frutas2.add("Mango");
		frutas2.add("Manzana");
		frutas2.add("Durazno");
		frutas2.add("Pera");
		frutas2.add("Cereza");
		frutas2.add("Mandarina");
		frutas2.add("Carambola");
		frutas2.add("Maracuya");
		frutas2.add("Platano");

		for(String f: frutas2) {
			System.out.println(f);
		} 
		
		int pera = frutas2.indexOf("Pera");
		System.out.println(pera);
		System.out.println(frutas2.get(pera));
		
		List<Integer> agenda = new ArrayList<Integer>();
		agenda.add(123);
		agenda.add(456);
		
		for(Integer a: agenda) {
			System.out.println(a);
		} 
		
		
		//LinkedList - va a tener mejor rendimiento cuando eliminamos o agregamos datos
		List<String> animales = new LinkedList<String>();
		animales.add("Perro");
		animales.add("Gato");
		animales.add("Conejo");
		animales.add("Zorro");
		animales.add("Oso");
		
		for(String an: animales) {
			System.out.println(an);
		} 
		
		/*
		 * la interfaz Map asocia claves a valores.
		 * no puede contener claves duplicadas y cada clave solo
		 * puede tener asociado un valor 
		 * 
		 * 
		 * Implementaciones
		 * HashMap
		 * TreeMap
		 * LinkendHashMap  - ordenar dependiendo de la orientacion de los datos
		 * 
		 * */
		
		Map <String, String> diccionario = new HashMap();
		diccionario.put("elemento1" , "Carlos Eduardo");
		
		System.out.println(diccionario.get("elemento1"));
		
		for (Map.Entry<String, String> entry : diccionario.entrySet()) {
			System.out.println(entry.getKey()+ ": " + entry.getValue());
		}
		
		
	}

}
