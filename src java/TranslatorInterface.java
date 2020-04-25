/**********************************************************
*TranslatorInterface.java         	Fecha de creacion: 22 de abril
*                           Ultima fecha de modificacion: 22 de abril
*                           
*Clase encargada de los metodos en comun entre un map y un tree
*
*@author Andrea Amaya #19357
*@author Walter saldana #19
**********************************************************/
import java.lang.*;

public interface TranslatorInterface<K extends Comparable<K>,V>{
	//Pre: El queue no esta vacio
	//Post: Se remueve y retorna el valor mas pequeno dentro del queue
	public V remove(K key);

	/**
	@param E 	Valor a agregar
	Post: Se agrega un valor al queue
	*/
	public V put(Association association);


	//Post: Se retorna la cantidad de elementos dentro del queue
	public int size();

	//Pre: Se busca una palabra
	//Post: Se retorna su traduccion
	public boolean searchValue(String searched);

	//Pre: Se busca una palabra
	//Post: Se retorna su traduccion
	public V get(Object key);
}