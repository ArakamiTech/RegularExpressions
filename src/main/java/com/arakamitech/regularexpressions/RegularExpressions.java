package com.arakamitech.regularexpressions;

import com.arakamitech.regularexpressions.enums.Enums;

/**
 *
 * @author Cristhian Torres for ArakamiTech
 */
public class RegularExpressions {

    public static void main(String[] args) {
        System.out.println("La Palabra Enviada Contiene ArakamiTech: " 
                + validaPalabra("12345ArakamiTech67890"));
        System.out.println("La Palabra Inicia Con abc: " + validaInicio("abcdario"));
        System.out.println("La Palabra Inicia Con Un Digito: " + validaNumeroEntero("7"));
        System.out.println("Es numero Entero Positivo: " + validaNumeroEnteroPositivo("1"));
        System.out.println("Es numero Entero Negativo: " + validaNumeroEnteroNegativo("-1"));
        System.out.println("Es una IP: " + validaIP("123.123.123.123"));
        System.out.println("Es numero Binario: " + validaBinario("1010001"));
        System.out.println("Es numero Hexadecimal: " + validaHexadecimal("1F"));
        System.out.println("Es numero Real: " + validaNumeroReal("10"));
        System.out.println("Es numero Real Positivo: " + validaNumeroRealPositivo("10"));
        System.out.println("Es numero Real Negativo: " + validaNumeroRealNegativo("-10"));
        System.out.println("El numero Decimal tiene 2 Decimales: " 
                + validaNumeroRealMaximoDosDecimales("1.88"));
        System.out.println("Es Fecha: " + validaFecha("23/10/2022"));
        System.out.println("Es Email: " + validaEmail("correo@hotmail.com"));
    }

    public static boolean validaPalabra(String texto) {
        return texto.matches(Enums.VALIDA_PALABRA_ARAKAMITECH.getValue());
    }
    
    public static boolean validaInicio(String texto) {
        return texto.matches(Enums.VALIDA_INICIO.getValue());
    }
     
    public static boolean validaNumeroEntero(String texto) {
        return texto.matches(Enums.NUMERO_ENTERO.getValue());
    }

    public static boolean validaNumeroEnteroPositivo(String texto) {
        return texto.matches(Enums.NUMERO_ENTERO_POSITIVO.getValue());
    }

    public static boolean validaNumeroEnteroNegativo(String texto) {
        return texto.matches(Enums.NUMERO_ENTERO_NEGATIVO.getValue());
    }

    public static boolean validaIP(String ip) {
        return ip.matches(Enums.IP.getValue());
    }

    public static boolean validaBinario(String binario) {
        return binario.matches(Enums.NUMERO_BINARIO.getValue());
    }

    public static boolean validaHexadecimal(String hexadecimal) {
        return hexadecimal.matches(Enums.NUMERO_HEXADECIMAL.getValue());
    }

    public static boolean validaNumeroReal(String texto) {
        return texto.matches(Enums.NUMERO_REAL.getValue());
    }

    public static boolean validaNumeroRealPositivo(String texto) {
        return texto.matches(Enums.NUMERO_REAL_POSITIVO.getValue());
    }

    public static boolean validaNumeroRealNegativo(String texto) {
        return texto.matches(Enums.NUMERO_REAL_NEGATIVO.getValue());
    }

    public static boolean validaNumeroRealMaximoDosDecimales(String texto) {
        return texto.matches(Enums.NUMERO_REAL_CON_2_DECIMALES.getValue());
    }

    public static boolean validaFecha(String texto) {
        return texto.matches(Enums.FECHA.getValue());
    }

    public static boolean validaEmail(String email) {
        return email.matches(Enums.EMAIL.getValue());
    }
}
