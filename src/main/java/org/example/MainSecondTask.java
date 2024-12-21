package org.example;

import java.util.stream.Stream;

public class MainSecondTask {
    public static void main(String[] args) {
        Stream<Person> personStream =  Stream.of(

                new Person("Ken",12),
                new Person("Alastair", 23),
                new Person("Piers", 25),
                new Person("Ellis", 27),
                new Person("Crispin", 56),
                new Person("Fergus", 98),
                new Person("Piers", 45),
                new Person("Conall", 86),
                new Person("Evan", 35),
                new Person("Lachlan", 75)
        );
        personStream
                .filter(age -> age.age  > 30)
                .forEach(name -> System.out.println(name.getName()));
    }
}

