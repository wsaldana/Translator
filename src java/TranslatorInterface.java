/**********************************************************
*TranslatorInterface.java         	Fecha de creacion: 22 de abril
*                           Ultima fecha de modificacion: 22 de abril
*                           
*Clase encargada de los metodos en comun entre un map y un tree
*
*@author Andrea Amaya #19357
*@author Walter saldana #19897
**********************************************************/

public interface TranslatorInterface<K extends Comparable<K>,V>{
	//Pre: El queue no esta vacio
	//Post: Se remueve y retorna el valor mas pequeno dentro del queue
	public V remove(K key);

	/**
	@param E 	Valor a agregar
	Post: Se agrega un valor al queue
	*/
	public V put(Association<K,V> association);


	//Post: Se retorna la cantidad de elementos dentro del queue
	public int size();

	//Pre: Se busca una palabra
	//Post: Se retorna su traduccion
	public boolean searchValue(K searched);

	//Pre: Se busca una palabra
	//Post: Se retorna su traduccion
	public V get(K key);
}