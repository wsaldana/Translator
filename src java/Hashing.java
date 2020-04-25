/**********************************************************
*QueueJava.java     Fecha de creacion: 21 de abril
*                   Ultima fecha de modificacion: 21 de abril
*                           
*Clase encargada de los metodos de un mapa hash
*
*@author Andrea Amaya #19357
*@author Walter Saldana #19
*
*Codigo adaptado de: Java Platform SE 8
https://docs.oracle.com/javase/8/docs/api/java/util/HashMap.html
**********************************************************/
import java.util.HashMap;
import java.lang.*;

public class Hashing<K extends Comparable<K>, V> implements TranslatorInterface<K,V>{
	protected HashMap<K, V> data  = new HashMap<K, V>(); // datos agregados

	public V remove(K key){
		return data.remove(key);
	}


	public V put(Association association){
		return data.put((K)association.getKey(), (V)association.getValue());
	}


	public int size(){
		return data.size();
	}

	public V get(Object key){
		return data.get(key);
	}

	public boolean searchValue(String searched){
		if (data.containsKey(searched)) {
			return true;
		}
		return false;
	}

}