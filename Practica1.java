package practica1;

import java.util.*;


public class Practica1 {

    //EJERCICIO 1
    public static Set<Integer> multiplos (Iterator<Integer> it) {
        Set<Integer> elementos= new HashSet<Integer>();
        Set<Integer> multiplos= new HashSet<Integer>();
        while(it.hasNext()){
            int elem= it.next();
            if(elementos.contains(elem) && elem!=0) multiplos.add(elem);
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
        Iterator<Integer> it=cuadrados.iterator();
        while(it.hasNext()){
            int elem=it.next();
            if(Math.sqrt(elem))
        }
    }

    //EJERCICIO 3
    public static<T> Collection<Set<T>> divideInSets (Iterator<T> it) {
        //TODO
        return null;
    }

    //EJERCICIO 4
    public static<T> Collection<Set<T>> coverageSet2 (Set<T> u,ArrayList<Set<T>> col) {
        //TODO
        return null;
    }



}
