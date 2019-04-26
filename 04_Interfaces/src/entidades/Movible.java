package entidades;

/**
 * Hace que los objetos se puedan mover. Cada objeto se movera como corresponda
 *  
 * @author Ismael
 * @version 1.0
 * @since 24/04/2019
 *
 */
public interface Movible {
	//no se pueden declarar atributos
	//los atributos que declaremos son constantes
	//siempre son abstractos y publicos los metodos, no comentario Javadoc
	/**
	 * Este metodo hace que el objeto se mueva de la manera mas lenta posible
	 */
	public void moverseLento();
	/**
	 * Este metodo hace que el objeto se mueva de la manera mas rapida posible
	 */
	public void moverseRapido();
	/**
	 * Este metodo hace que el objeto se mueva una cantidad de metros
	 * @param metros representa los metros que se movera el objeto
	 * @return representa la posicion donde esta el objeto
	 */
	public int moverse(int metros);

}
