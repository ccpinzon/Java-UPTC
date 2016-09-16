/**
 * 
 */
package cosas;

import compromisos.Comunicacion;

/**
 * @author user
 *
 */
public class Cucu extends Reloj implements Comunicacion {

	/* (non-Javadoc)
	 * @see compromisos.Comunicacion#comunicarse()
	 */
	@Override
	public String comunicarse() {
		// TODO Auto-generated method stub
		return "El reloj se comunica con el sonido cucu cucu";
	}

}
