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
public class Hashing<K, V> implements TranslatorInterface<K,V>{
	protected HashMap<K, V> data  = new HashMap<K, V>(); // datos agregados

	public V remove(K key){
		return data.remove(key);
	}


	public V put(K key, V value){
		return data.put(key, value);
	}


	public int size(){
		return data.size();
	}

}