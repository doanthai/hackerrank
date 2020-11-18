package com.hackerrank.java.bitset;

import java.util.*;

public class CollectionFramework {
  public static void main(String[] args) {
//    List<String> arrayList = new ArrayList<>();
//    List<String> linkedList = new LinkedList<>();
//    arrayList.add("a");
//    linkedList.add("a");
//    linkedList.add("b");
////    linkedList.remove("b");
//    ListIterator<String> stringListIterator = linkedList.listIterator(linkedList.size());
//    while (stringListIterator.hasPrevious()) {
//      System.out.println(stringListIterator.previous());
//    }
//    System.out.println(stringListIterator.forEachRemaining(););
//    linkedList.
//    Set<Integer> hashSet = new HashSet<>();
//    hashSet.add(1);
//    hashSet.add(3);
//    hashSet.add(2);
//    hashSet.forEach(System.out::println);
//    Person thai = new Person("thai");
//    Person thaid2 = new Person("thai");
//    System.out.println(thai.hashCode() == thaid2.hashCode());
//    System.out.println(thai.equals(thaid2));
//    Set<Person> persons = new HashSet<>();
//    persons.add(thai);
//    persons.add(thaid2);
//    for (Person person : persons) {
//      System.out.println(person.getName());
//    }
//    NavigableSet<String> treeSet = new TreeSet<>();
//    treeSet.add("A");
//    treeSet.add("B");
//    treeSet.add("D");
//    treeSet.add("C");
//    String c = treeSet.ceiling("E");
//    System.out.println(c);
//    treeSet.add(null);
//    Set<Person> persons = new HashSet<>();
//    persons.add(new Person())
//    Queue<Integer> queue = new PriorityQueue<>();
//    queue.add(1);
//    queue.add(2);
//    queue.add(4);
//    queue.add(3);
//    for (int x: queue) {
//      System.out.println(x);
//    }
//
//    Deque<Integer> aQueue = new ArrayDeque<>();
//    aQueue.add(1);
//    aQueue.add(2);
//    aQueue.add(4);
//    aQueue.add(3);
//    for (int x: queue) {
//      System.out.println(x);
//    }

    HashMap<String, Integer> map = new HashMap<>();
    map.put("Aman", 19);
    map.put("Sunny", 29);
    map.put("Ritesh", 39);
    for (Map.Entry<String, Integer> entry: map.entrySet()) {
//      System.out.println(entry.getKey() + "=" + entry.getValue());
      System.out.println(entry);
    }
  }

  public static class Person {
    public Person(String name) {
      this.name = name;
    }

    private String name;

    public String getName() {
      return name;
    }

    @Override
    public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      Person person = (Person) o;
      return Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
      return Objects.hash(name);
    }
  }
}
