package practica1;

import java.util.*;


public class Practica1 {

    //EJERCICIO 1
    public static Set<Integer> multiplos (Iterator<Integer> it) {
        Set<Integer> elementos= new HashSet<Integer>();
        Set<Integer> multiplos= new HashSet<Integer>();
        while(it.hasNext()){
            int elem= it.next();
            if(elementos.contains(elem)) multiplos.add(elem);
            if(elem!=0) elementos.add(elem);
        }
        for(int a:elementos){
            for(int b:elementos){
                if(a%b==0 && a!=b) multiplos.add(a);
            }
        }
        return multiplos;
    }

    //EJERCICIO2
    public static void separate (Set<Integer> cuadrados, Set<Integer> noCuadrados)  {
        Set<Integer> todos=new HashSet<>();
        boolean hay0=false;
        boolean hay1=false;
        if(cuadrados.contains(1) && noCuadrados.contains(1)) hay1=true;
        if(cuadrados.contains(0) && noCuadrados.contains(0)) hay0=true;
        todos.addAll(cuadrados);
        todos.addAll(noCuadrados);
        cuadrados.clear();
        noCuadrados.clear();
        Iterator<Integer> it= todos.iterator();
        while(it.hasNext()) {
            int elem = it.next();
            if (elem == 0) {
                if (hay0) continue;
                else noCuadrados.add(elem);
            } else if (elem == 1) {
                if (hay1) continue;
                else noCuadrados.add(elem);
            } else if (todos.contains(elem * elem)) {
                cuadrados.add(elem * elem);
                noCuadrados.add(elem);
            } else if (cuadrados.contains(elem)) {
                continue;
            } else {
                noCuadrados.add(elem);
            }
        }
        if(hay1) cuadrados.add(1);
        if(hay0) cuadrados.add(0);
    }

    //EJERCICIO 3
    public static<T> Collection<Set<T>> divideInSets (Iterator<T> it) {
        Collection<Set<T>> coleccion= new LinkedList<>();

        while(it.hasNext()) {
            T elem = it.next();
            boolean encontrado = false;
            for (Set<T> a : coleccion) {
                if (!a.contains(elem)) {
                    a.add(elem);
                    encontrado = true;
                    break;
                }
            }
            if (!encontrado){
                Set<T> nuevo=new HashSet<>();
                nuevo.add(elem);
                coleccion.add(nuevo);
            }
        }

        return coleccion;
    }

    //EJERCICIO 4
    public static<T> Collection<Set<T>> coverageSet2 (Set<T> u,ArrayList<Set<T>> col) {
        Collection<Set<T>> resultado= new HashSet<>();
        for(Set<T> a: col){
            if(a.containsAll(u)) continue;
            for(Set<T> b: col){
                if(b.containsAll(u)) continue;
                Set<T> suma= new HashSet<>();
                suma.addAll(a);
                suma.addAll(b);
                if(suma.containsAll(u)){
                    resultado.add(a);
                    resultado.add(b);
                    return resultado;
                }
            }
        }
        return resultado;
    }



}
