package utilidades;

/**
 *
 * @author Gonz@_
 */

public class ValidarCUIT {

    private static final String[] PRIMEROS_DIGITOS_VALIDOS = { "20", "23", "24", "27", "30", "33", "34" }; // Primeros 2 dígitos válidos para entidades tipo laboratorios

    public static boolean esUnCUITValido(String cuit) {
        if (cuit.length() != 11) {      // Valida que el CUIT tenga 11 dígitos
            return false;
        }

        String digitos12 = cuit.substring(0, 2);     // Obtiene los primeros dos dígitos del CUIT

        if (!esCaracterValido(digitos12)) {     // Valida los primeros dos dígitos
            return false;
        }

        // Realiza la suma ponderada según la fórmula dada
        int suma = 0;
        int[] coeficientes = { 5, 4, 3, 2, 7, 6, 5, 4, 3, 2, 1 };
        for (int i = 0; i < 10; i++) {
            int digito = Character.getNumericValue(cuit.charAt(i));
            suma += digito * coeficientes[i];
        }

        // Calcula el dígito verificador
        int resto = suma % 11;
        int digitoVerificadorCalculado = (resto == 0) ? 0 : (11 - resto);

        // Obtiene el dígito verificador del CUIT
        int digitoVerificadorIngresado = Character.getNumericValue(cuit.charAt(10));

        // Compara el dígito verificador calculado con el ingresado
        return (digitoVerificadorCalculado == digitoVerificadorIngresado);
    }

    private static boolean esCaracterValido(String caracteres) {
        for (String valido : PRIMEROS_DIGITOS_VALIDOS) {
            if (caracteres.equals(valido)) {
                return true;
            }
        }
        return false;
    }

    public static int calcularDigitoVerificador(String cuitSinUltimoDigito) {
        // Verifica que el CUIT sin último dígito tenga 10 dígitos
        if (cuitSinUltimoDigito.length() != 10) {
            throw new IllegalArgumentException("El CUIT sin último dígito debe tener 10 dígitos.");
        }

        // Realiza la suma ponderada según la fórmula dada
        int suma = 0;
        int[] coeficientes = { 5, 4, 3, 2, 7, 6, 5, 4, 3, 2 };
        for (int i = 0; i < 10; i++) {
            int digito = Character.getNumericValue(cuitSinUltimoDigito.charAt(i));
            suma += digito * coeficientes[i];
        }

        // Calcula el dígito verificador
        int resto = suma % 11;
        return (resto == 0) ? 0 : (11 - resto);
    }
}
