/**********************************************************
*Association.java           Fecha de creacion: 22 de abril
*                           Ultima fecha de modificacion: 22 de abril
*                           
*Clase encargada de los atributos de una asociacion
*
*@author Andrea Amaya #19357
*@author Walter Saldana #19

*Codigo adaptado de: Java Structures: Data Structures pagina 16 y pagina 257
**********************************************************/
import java.lang.*;

public class Association<K extends Comparable<K>, V> {
    private K key;
    private V value;

    /**
    @param key          Llave
    @param value        Valor
    Post: Se construye la asosiaccion
    */
    public Association(K key, V value){
        this.key = key;
        this.value = value;
    }

    /**
    Pre: Asocacion a obtener la llave
    @return La llave de la asociacion
    */
    public K getKey(){
        return this.key;
    }

    /**
    Pre: Asocacion a obtener el valor
    @return El valor de la asociacion
    */
    public V getValue() {
        return this.value;
    }

    /**
    @param that         Se recibe la asociacion a comparar
    Pre: Tener una asociacion a comparar con otra asociacion
    @return Un entero que representa la comparacion 
    */
    public int compareTo(Association<K,V> that){
        return key.compareTo(that.key);
    }

}
