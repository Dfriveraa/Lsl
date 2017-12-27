/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author danie
 */
public class nodoSimple {

    private Object dato;
    private nodoSimple liga;

    public nodoSimple() {

    }

    public nodoSimple(Object dato) {
        this.dato = dato;
        liga = null;

    }

    public Object retornaDato() {
        return dato;
    }

    public nodoSimple retornaLiga() {
        return liga;
    }

    public void asignaLiga(nodoSimple j) {
        liga = j;
    }

    public void asignaDato(Object x) {
        dato = x;
    }
    
}
