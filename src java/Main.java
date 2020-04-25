/**********************************************************
*Main.java					Fecha de creacion: 24 de abril
*							Ultima fecha de modificacion: 24 de abril
*							
*Clase principal para interactuar con el usuario
*
*@author Andrea Amaya #19357
*@author Walter Saldana #19
**********************************************************/
import java.util.*;
import java.io.*; 

public class Main{
	public static void main(String[] args) {
		TranslatorInterface dictionary; //Espacio para el diccionario
		ArrayList<String> text = new ArrayList<String>(); //Texto

		dictionary = new Hashing();

		//Se leen ambos txt
		try {
			Scanner r = new Scanner(new File("Spanish.txt")); 
			while (r.hasNextLine()) {
				String txt = r.nextLine(); //Mientras hayan lineas por leer se meten a la variable txt
				String[] word = txt.split("	"); 

				if(word.length != 2 ){
					word = txt.split("\\s+");
				} 


				try{
					try {
						String[] posible = word[1].split(",");
						dictionary.put(new Association(word[0], posible[0])); //Se agrega
					} catch (Exception e) {
						//No tiene varios significados en la misma linea
						dictionary.put(new Association(word[0], word[1])); //Se agrega
					}
					
				} catch (Exception e) {
					//Ya existe la palabra en el diccionario (llave repetida)
				}
				
			}
			r.close();	
		} catch (Exception e) { //Se muestra la razon de error por la que no se encuentra el doc
			e.printStackTrace();
		}

		try {
			Scanner r = new Scanner(new File("texto.txt")); 
			while (r.hasNextLine()) {
				String txt = r.nextLine(); //Mientras hayan lineas por leer se meten a la variable txt
				txt = txt.replace(".", ""); 
				String[] word = txt.split(" "); 

				for (int i=0; i<word.length; i++) {
					text.add(word[i]); //Se agrega al texto	
				}
				
			}
			r.close();	
		} catch (Exception e) { //Se muestra la razon de error por la que no se encuentra el doc
			e.printStackTrace();
		}

		System.out.println(text); //Antes de la traduccion

		//Por cada palabra en el texto/
		for (int i=0; i<text.size(); i++) {
			String actual = text.get(i).toLowerCase();
			//Por cada palabra en el diccionario
			for (int j=0; j<dictionary.size(); j++) {
				//Si la palabra del diccionario es igual a la palabra actual del texto
				if (dictionary.searchValue(actual)) {
					if (i+1 == text.size()) {
						text.set(i,dictionary.get(actual).toString()+"."); //Se vuelve a colocar el punto
					} else{
						text.set(i,dictionary.get(actual).toString()); //Se coloca la palabra
					}
					
					break;
				}
			}	
		}

		System.out.println(text); //Despues de la traduccion



	}
}


