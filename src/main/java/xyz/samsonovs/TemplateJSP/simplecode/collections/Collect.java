package xyz.samsonovs.TemplateJSP.simplecode.collections;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


/**
 * Created by Костя on 15.07.2017.
 * for each collection input parametres, revert collection, change 1&8 element, input to center, find element,send to next collection
 */
public class Collect {
    public void printCollect() {
        ///Array
        int[] mArray=new int[10];
        for (int i=0;i<10;i++)mArray[i]=i;
        System.out.println();
        System.out.print(" Array: ");
        for(int a:mArray)System.out.print(a);
        Integer[] boxedArray = IntStream.of(mArray).boxed().toArray(Integer[]::new);
        Set<Integer> set = IntStream.of(mArray).boxed().collect(Collectors.toSet());
        HashSet<Integer> hashset = IntStream.of(mArray).boxed().collect(Collectors.toCollection(HashSet::new));
        System.out.println("HASHSET: "+hashset);


        //HashSet
        System.out.println("HASHSET SIZE: "+hashset.size());
        hashset.add(10);
        System.out.println("HASHSET BEEN ADDED ELEMENT: "+hashset);
        Iterator<Integer> iterator = hashset.iterator();  Integer elem=iterator.next();
        System.out.println("HASHSET 1 ELEMENT: "+elem);
        System.out.println("HASHSET INCLUDE 1: "+hashset.contains(1));
        Set<Integer> tree = new TreeSet<Integer>(hashset);
        System.out.println("TreeSet : "+ tree);


        ///TreeSet
        tree.add(11);
        System.out.println("TreeSet added element: "+ tree);
        Set<Integer> linkhset = new LinkedHashSet<Integer>(tree);
        System.out.println("LinkedHashset: "+ linkhset);

        //LinkedHashset
        Iterator<Integer> iteratorLinkedHshSet=linkhset.iterator(); Integer elem2=iteratorLinkedHshSet.next();
        System.out.println("LinkedHashSet 1 ELEMENT: "+elem2);
        Map<String,Integer> linkedHashMapMap = new LinkedHashMap<String,Integer>();
        Integer i=0;
        for(Integer elem3:linkhset) {
            linkedHashMapMap.put(i.toString(),elem3);
            i++;
         }
         System.out.println("LinkedHashMap:"+linkedHashMapMap);


        ///LinkedHashMap
        System.out.println("LinkedHashMap get 2:"+linkedHashMapMap.get("2"));
        linkedHashMapMap.remove("11");
        System.out.println("LinkedHashMap:"+linkedHashMapMap);
        Map<String,Integer> hashMap = new HashMap<>(linkedHashMapMap);
        System.out.println("HashMap:"+hashMap);


        ///HashMap
        hashMap.remove("10");
        System.out.println("HashMap remove 10:"+hashMap);
        Map<String,Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("TreeMap:"+treeMap);

        ///TreeMap
        treeMap.put("10",10);
        System.out.println("TreeMap added element: "+ treeMap);
        LinkedList<Integer> linkedList=new LinkedList<>();
        for(Map.Entry<String, Integer> item : treeMap.entrySet())
            linkedList.add(item.getValue());
        System.out.println("LinkedList: "+linkedList);

        ///Linkedlist
        ListIterator<Integer> iteratorLinkedList=linkedList.listIterator();
        iteratorLinkedList.next();
        iteratorLinkedList.add(11);
        System.out.println("LinkedList added 11:"+linkedList);
        Collections.sort(linkedList);
        System.out.println("LinkedList has been sorted: "+linkedList);
        List<Integer> arrayList=new ArrayList<Integer>(linkedList);
        System.out.println("ArrayList:"+arrayList);
        ///Arraylist
        arrayList.remove(5);
        System.out.println("ArrayList remove 5:"+arrayList);


    }
}
