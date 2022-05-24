package sumador;

public class ASumar {
	
	/**
	 * @param cadena
	 * @return
	 */

	public String sumativo(String cadena) {
        String numero = cadena;
        String salida="";
        int suma = 0;
        if (numero.contains("-")) { //Si contiene un guion es negativo
        	return "Negativo. Siempre negativo";
        }else if (numero.length() == 1) { //Si solo hay un numero
            return (numero + " = " + numero);
        } else {
            for (int i = 0; i < cadena.length(); i++) {
                String digito = cadena.substring(i, 1); // Cadena de un dígito.
                suma = suma + Integer.getInteger(digito);  //Conversión de caracter a entero
                if (i == cadena.length()-1) { //Cuando sea el ultimo digito que ponga = en vez de +
                	salida += digito+" =";
                } else {
                    salida += digito+" + ";
                }
            }
            salida +=" "+suma; //Añadimos la suma
        }
        return salida;
	}
}