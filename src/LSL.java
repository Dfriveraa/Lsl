/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author danie
 */
public class LSL {

    private nodoSimple primero, ultimo;

    public LSL() {
    }

    public boolean esVacia() {
        if (primero == null) {
            return true;
        }
        return false;
    }

    public nodoSimple getPrimero() {
        return primero;
    }

    public nodoSimple getUltimo() {
        return ultimo;
    }

    public boolean finDeRecorrido(nodoSimple x) {
        return x == null;
    }

    public void recorre() {
        nodoSimple p = getPrimero();
        while (!finDeRecorrido(p)) {
            System.out.println(p.retornaDato());
            p = p.retornaLiga();
        }
    }

    public nodoSimple buscarDondeInsertar(Object d) {
        nodoSimple x, y;
        x = getPrimero();
        y = anterior(x);

        /*  while (!finDeRecorrido(x) && (x.retornaDato() < d)) {
            y = x;
            x = x.retornaLiga();
        }*/
        return y;
    }

    public nodoSimple anterior(nodoSimple x) {
        nodoSimple j = getPrimero();
        nodoSimple k = null;
        while (j != x) {
            k = j;
            j = j.retornaLiga();
        }
        return k;
    }

    public void conectar(nodoSimple x, nodoSimple y) {
        if (y == null) {
            x.asignaLiga(getPrimero());
            if (primero == ultimo) {
                setUltimo(x);
            }
            setPrimero(x);
        } else {
            x.asignaLiga(y.retornaLiga());
            y.asignaLiga(x);
            if (y == getUltimo()) {
                setUltimo(x);
            }
        }
    }

    public void insertarDato(Object d, nodoSimple y) {
        nodoSimple x = new nodoSimple(d);
        conectar(x, y);
    }

    public nodoSimple buscarDato(Object d) {
        nodoSimple p = getPrimero();
        while (p.retornaDato() != d && !finDeRecorrido(p)) {
            p = p.retornaLiga();
        }
        return p;
    }
    public void borrar (nodoSimple a)
    {
    bloque
    }
    public void setPrimero(nodoSimple primero) {
        this.primero = primero;
    }

    public void setUltimo(nodoSimple ultimo) {
        this.ultimo = ultimo;
    }

}
