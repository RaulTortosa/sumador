package sumador;

public class ASumar {
	
	/**
	 * @param cadena
	 * @return
	 */

	public String sumativo(String cadena) {
        String numero = cadena;
        if (numero.length() == 1) {
            return (numero + " = " + numero);
        }
        if (numero.contains("-")) {
        	return "Negativo. Siempre negativo";
        }
		return null;
	}



}