/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tp.ferramentas.auxiliar;

/**
 *
 * @author Julio
 */
public class BuscarEnumFromString {
    public static <T extends Enum<T>> T fromString(Class<T> enumClass, String value) {
        if (enumClass != null && value != null) {
            try {
                return Enum.valueOf(enumClass, value.trim().toUpperCase());
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException("Valor inválido para a enumeração " + enumClass.getSimpleName());
            }
        }
        throw new IllegalArgumentException("Parâmetros 'enumClass' e 'value' não podem ser nulos.");
    }
}