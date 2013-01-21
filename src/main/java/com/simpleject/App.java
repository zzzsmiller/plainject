package com.simpleject;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import static java.lang.System.out;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        out.println( "Hell YEAH!" );

        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        LinkedList<Integer> linkedList = new LinkedList<Integer>();

        timeTest(arrayList.getClass().getSimpleName(), arrayList);
        timeTest(linkedList.getClass().getSimpleName(), linkedList);
    }

    private static void timeTest(String simpleName, List<Integer> list) {
        System.out.println("JAVA Collection Instance: " + simpleName);

        System.out.println("Adding");
        System.out.println("Start:" + System.currentTimeMillis());
        Random random = new Random();
        for (int i=1; i<1E10; i++) {
            list.add(random.nextInt(7000));
        }
        System.out.println("End:" + System.currentTimeMillis());


        System.out.println("Retreiving");
        System.out.println("Start:" + System.currentTimeMillis());
        for (Integer i : list) {
            Integer j = list.get(i);
        }
        System.out.println("End:" + System.currentTimeMillis());


    }
}
