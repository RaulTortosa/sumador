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
        	int contador = numero.length();
        	String caracter;
            for (int i = 0; i < numero.length(); i++) {
                caracter = numero.substring(i, i+1); // Cadena de un dígito.
                int digito = Integer.parseInt(caracter); //Conversión de caracter a entero
                suma = suma + digito;  
                contador--;
                if (contador == 0) { //Cuando sea el ultimo digito que ponga = en vez de +
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