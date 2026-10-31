package com.vcubelab_dailytest.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class CollectionInterfaceDemo {

    public static void main(String[] args) {

        Collection<Integer> numbers = new ArrayList<>();

        // 1. add()
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(20);
        System.out.println("Collection: " + numbers);

        // 2. size()
        System.out.println("Size: " + numbers.size());

        // 3. contains()
        System.out.println("Contains 20: " + numbers.contains(20));

        // 4. isEmpty()
        System.out.println("Is Empty: " + numbers.isEmpty());

        // 5. remove()
        numbers.remove(20);
        System.out.println("After remove(): " + numbers);

        // 6. addAll()
        Collection<Integer> extraNumbers = new ArrayList<>();
        extraNumbers.add(50);
        extraNumbers.add(60);

        numbers.addAll(extraNumbers);
        System.out.println("After addAll(): " + numbers);

        // 7. containsAll()
        System.out.println("Contains all extraNumbers: "
                + numbers.containsAll(extraNumbers));

        // 8. removeAll()
        numbers.removeAll(extraNumbers);
        System.out.println("After removeAll(): " + numbers);

        // 9. retainAll()
        Collection<Integer> commonNumbers = new ArrayList<>();
        commonNumbers.add(10);
        commonNumbers.add(30);
        commonNumbers.add(100);

        numbers.retainAll(commonNumbers);
        System.out.println("After retainAll(): " + numbers);

        // 10. iterator()
        System.out.println("Using Iterator:");

        Iterator<Integer> iterator = numbers.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // 11. toArray()
        Object[] array = numbers.toArray();
        System.out.println("Array: " + Arrays.toString(array));

        // 12. removeIf()
        numbers.removeIf(number -> number > 20);
        System.out.println("After removeIf(): " + numbers);

        // 13. forEach()
        System.out.println("Using forEach():");
        numbers.forEach(System.out::println);

        // 14. stream()
        System.out.println("Using stream():");
        numbers.stream().forEach(System.out::println);

        // 15. hashCode()
        System.out.println("HashCode: " + numbers.hashCode());

        // 16. clear()
        numbers.clear();
        System.out.println("After clear(): " + numbers);

        // 17. isEmpty()
        System.out.println("Is Empty now: " + numbers.isEmpty());
    }
}