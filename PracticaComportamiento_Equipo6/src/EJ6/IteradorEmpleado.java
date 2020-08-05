/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJ6;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 *
 * @author Danny
 */
public class IteradorEmpleado implements Iterador {

    Nodo raiz;
    Nodo actual;
    Stack<Nodo> stack;
    int indice;

    public IteradorEmpleado(Nodo raiz) {
        this.raiz = raiz;
        actual = raiz;
        stack = new Stack();
        stack.push(raiz);
        indice = -1;
        while (!actual.esHoja()) {
            actual = actual.getHijos().get(0);
            stack.push(actual);
        }
    }

    @Override
    public Object next() {
        actual = stack.peek();
        Nodo res = stack.peek();

        if (actual.esHoja()) {
            Nodo anterior = stack.pop();
            actual = stack.peek();
            indice = anterior.getIndice() + 1;
            while (indice >= actual.getHijos().size() && actual.getPadre() != null) {
                anterior = stack.pop();
                actual = stack.peek();
                indice = anterior.getIndice() + 1;
            }
            if (actual.getPadre() == null) {
                if (indice < actual.getHijos().size()) {
                    actual = actual.getHijos().get(indice);
                    stack.push(actual);
                    while (!actual.esHoja()) {
                        actual = actual.getHijos().get(0);
                        stack.push(actual);
                    }
                    return res;
                } else {
                    stack.pop();
                    return res;
                }
            } else {
                actual = actual.getHijos().get(indice);
                stack.push(actual);
                return res;
            }

        } else {
            indice = 0;
            while (!actual.esHoja()) {
                actual = actual.getHijos().get(indice);
                stack.push(actual);
            }
            return res;
        }

    }

    @Override
    public boolean hasNext() {
        return !stack.isEmpty();
    }

    public void recorrerArbol(Nodo nodoRaiz) {
        if (nodoRaiz.esHoja()) {
            System.out.println(nodoRaiz.getValor());
        }
        for (final Nodo nodo : nodoRaiz.getHijos()) {
            recorrerArbol(nodo);
        }
    }
}
