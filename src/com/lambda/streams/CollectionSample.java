package com.lambda.streams;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

/**
 * @author Ansari on 3/3/2019
 */
public class CollectionSample {

    public static void main(String[] args) {
        List<String> names = asList("Paul", "Jane", "Michaela", "Sam");
        //way to sort prior to Java 8 lambdas
        Collections.sort(names,new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        System.out.println(names);

        //first iteration using lambda
        Collections.sort(names, (String a, String b) -> {return b.compareTo(a);});
        System.out.println(names);

        //second iteration
        //now remove the return statement
        Collections.sort(names, (String a, String b) -> a.compareTo(b));
        System.out.println(names);

        //third iteration
        //now remove the data types and allow the compile to infer the type
        Collections.sort(names,(a,b) -> b.compareTo(a));
        System.out.println(names);

        //total pages in your book collection
        Book book1 = new Book("King Cobra Fights",
                "Ali", "Khali", 382);
        Book book2 = new Book("Harry Potter",
                "JK", "Rowling", 411);
        Book book3 = new Book("The Cat in the Hat",
                "Dr", "Seuss", 45);

        List<Book> books = asList(book1, book2, book3);
        System.out.println("====================================");
        System.out.println(books);

        int totalPages = books.stream()
                .collect(Collectors.summingInt(Book::getPages));
        System.out.println(totalPages);

        //create a list with duplicates
        List<Book> duplicateBooks = asList(book1,book2,book1,book3,book2);
        System.out.println("Before removing duplicates: ");
        System.out.println(duplicateBooks.toString());

        Collection<Book> noDups = new HashSet<>(duplicateBooks);
        System.out.println("After removing duplicates: ");
        System.out.println(noDups.toString());

        //aggregate author first names into a list
        //Streams represent sequence of elements
        List<String> list = books.stream()
                .map(Book::getAuthorLName)
                .collect(Collectors.toList());
        System.out.println(list);

        //example of using Set to eliminate dups and sort automatically
        Set<Integer> numbers = new HashSet<>(asList(4, 3, 3, 3, 2, 1, 1, 1));
        System.out.println(numbers.toString());
    }
}
