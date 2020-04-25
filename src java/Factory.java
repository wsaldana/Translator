/**********************************************************
*Factory.java				Fecha de creacion: 22 de abril
*							Ultima fecha de modificacion: 22 de abril
*							
*Factory para instanciar el tree/map
*
*@author Andrea Amaya #19357
*@author Walter Saldana #19357
**********************************************************/
public class Factory{
	/**
	//Pre: Haber elegido un traductor 
	//Post: Intancia de tipo de tranductor seleccionado
	 * @param tipoTranslator   Tipo de translator a instanciar
	*/
	public TranslatorInterface getTranslator(int tipoTranslator){
		if (tipoTranslator == 1) { //Es un hash map
			return new Hashing();
		} else { //Es un splay tree
			return new Hashing();
		}
	}
}