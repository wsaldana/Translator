/**********************************************************
*QueueJava.java     Fecha de creacion: 21 de abril
*                   Ultima fecha de modificacion: 21 de abril
*                           
*Clase encargada de los metodos de un mapa hash
*
*@author Andrea Amaya #19357
*@author Walter Saldana #19897
*
*Codigo adaptado de: Java Platform SE 8
https://docs.oracle.com/javase/8/docs/api/java/util/HashMap.html
**********************************************************/
import java.util.HashMap;

public class Hashing<K extends Comparable<K>, V> implements TranslatorInterface<K,V>{
	private HashMap<K, V> data ; // datos agregados

	public Hashing(){
		this.data = new HashMap<K, V>();
	}

	@Override
	public V remove(K key){
		return data.remove(key);
	}

	@Override
	public V put(Association<K,V> association){
		return data.put((K)association.getKey(), (V)association.getValue());
	}

	@Override
	public int size(){
		return data.size();
	}

	@Override
	public boolean searchValue(K searched) {
		if (data.containsKey(searched)) {
			return true;
		}
		return false;
	}

	@Override
	public V get(K key) {
		return data.get(key);
	}

}