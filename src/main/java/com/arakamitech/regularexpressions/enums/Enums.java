/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.arakamitech.regularexpressions.enums;

/**
 *
 * @author Cristhian Torres for ArakamiTech
 */
public enum Enums {

    EMAIL("^([\\w-]+\\.)*?[\\w-]+@[\\w-]+\\.([\\w-]+\\.)*?[\\w]+$"),
    //Formato de fecha dd/mm/aaaa
    FECHA("^(0?[1-9]|[12][0-9]|3[01])[\\/](0?[1-9]|1[012])[/\\/](19|20)\\d{2}$"),
    IP("^(([1-9]?[0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5]).){3}([1-9]?[0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])$"),
    NUMERO_BINARIO("^[0-1]+$"),
    NUMERO_ENTERO("^-?[0-9]+$"),
    NUMERO_ENTERO_POSITIVO("^[0-9]+$"),
    NUMERO_ENTERO_NEGATIVO("^-[0-9]+$"),
    NUMERO_HEXADECIMAL("^[0-9A-F]+$"),
    NUMERO_REAL("^-?[0-9]+([\\.,][0-9]+)?$"),
    NUMERO_REAL_POSITIVO("^[0-9]+([\\.,][0-9]+)?$"),
    NUMERO_REAL_NEGATIVO("^-[0-9]+([\\.,][0-9]+)$"),
    NUMERO_REAL_CON_2_DECIMALES("^-?[0-9]+([\\.,][0-9]{1,2})?$"),
    VALIDA_INICIO("^abc.*"),
    //Valida si contiene ArakamiTech en toda la oracion enviada
    VALIDA_PALABRA_ARAKAMITECH(".*ArakamiTech.*");

    private String value;

    Enums(String value) {
        this.setValue(value);
    }

    public String getValue() {
        return value;
    }

    private void setValue(String value) {
        this.value = value;
    }

}
