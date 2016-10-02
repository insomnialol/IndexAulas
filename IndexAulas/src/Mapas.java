
public class Mapas {
	
	/* Map is an interface that provides a blueprint for data structures that take  pairs and map keys to their associated values 
	 * (it's important to note that both the  and the  must be Objects and not primitives). 
	 * The implementation is done by implementing classes such as HashMap or LinkedHashMap. 
	
	Here are few Map methods:
	containsKey(Object key): Returns true if the map contains a mapping for ; returns false if there is no such mapping.
	get(Object key): Returns the value to which the  is mapped; returns null if there is no such mapping.
	put(K key, V value): Adds the (Key, Value) mapping to the Map; if the  is already in the map, the  is overwritten.
	 */
	
//	Map<String, String> meuMapa; // declara a String para String Map
// 	meuMapa = new HashMap<String, String>();  // inicializa a nova String para uma String HashMap
//	meuMapa = new LinkedHashMap<String, String>(); // muda o meuMapa para ser uma String LinkedHashMap completamente diferente

	Map<String,String> meuMapa = new HashMap<String,String>(); // cria o Mapa de String Keys to String Values, implementado pela classe HashMap
	    
	meuMapa.put("Hi", "Bye");	// adiciona Hi e Bye mapping ao meuMapa
	System.out.println(meuMapa.get("Hi")); 	// Print the Value mapped to from "Hi"
	meuMapa.put("Hi", "Bye!"); 	// Replaces "Bye" mapping from "Hi" with "Bye!" 
	System.out.println(meuMapa.get("Hi")); 	// Print the Value mapped to from "Hi"

	
	/* FAZ O OUTPUT
	Bye
	Bye!
	*/
}
