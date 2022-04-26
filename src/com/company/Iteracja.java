package com.company;

import java.util.*;

public class Iteracja {

    public static void main(String[] args) {
        List<String> listaStr = new ArrayList<>();
        listaStr.add("one");
        listaStr.add("two");
        listaStr.add("three");
        listaStr.add("four");

        List<Integer> listaInt = new ArrayList<>();
        listaInt.add(100);
        listaInt.add(200);
        listaInt.add(300);
        listaInt.add(400);

        Set<String> kolSet = new HashSet<>();
        kolSet.add("str 1");
        kolSet.add("str 2");
        kolSet.add("str 3");
        kolSet.add("str 4");

        Map<Integer, String> mapa = new HashMap<>();
        mapa.put(1, " 1*");
        mapa.put(2, " 2*");
        mapa.put(3, " 3*");
        mapa.put(4, " 4*");


//        System.out.println("\n======== List Int - w przód =======");
//
//        Iterator i = listaInt.listIterator();
//        while (i.hasNext()) {
//            System.out.println(((ListIterator) i).nextIndex() + " : " + i.next());
//        }
//
//        System.out.println("\n======== List Int - w tył ========");
//
//        while (((ListIterator) i).hasPrevious()) {
//            System.out.println(((ListIterator) i).previousIndex() + " : " + ((ListIterator) i).previous());


//        System.out.println("\n======== Set String - w przód =======");
//
//        Iterator i = kolSet.iterator();
//        while (i.hasNext()) {
//                System.out.println(i.next());

        Iterator<Integer> i = mapa.keySet().iterator();
        while (i.hasNext()){
            Integer key = i.next();
            System.out.println(key + " : " + mapa.get(key));
        }
    }
}
