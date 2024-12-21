package org.example;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;



public class Main {
    public static void main(String[] args) {
        List<String> products = new ArrayList<>(Arrays.asList("oranges", "bananas", "pineapples", "Apricots"));
        long count = products.stream()
                .flatMap(str -> Stream.of(str.split("[ ,.!?\n]")))
                .filter(str ->  str.charAt(0) == 'b')
                .count();

        System.out.println("Count of all the words with the first character equal to '" + "b" + "' is " + count);
    }
}























