package com.mycompany.app;
import com.google.gson.Gson;
import com.mycompany.app.models.Transaction;

import java.util.*;
import java.util.stream.IntStream;

public class App {

    public static List<String> find(String word, Map<String, List<String>> dictionary){

            return dictionary.get(word.toLowerCase());
    }

    public static void main(String[] args) {

        System.out.print("Task 1:   ");

        Gson gson = new Gson();
        String json = gson.toJson("Feras");

        System.out.println(json);

        System.out.print("Task 2:   ");

        Map<String, List<String>> dictionary = new HashMap<>();

        dictionary.put("hello", Arrays.asList("Hi", "Welcome", "Greetings"));
        dictionary.put("work", Arrays.asList("Job", "Duty"));

        System.out.println(find("Hello", dictionary));

        System.out.println("Task 3:   ");

        List<Transaction> transactions = IntStream.range(0, 100)
                .mapToObj(i -> new Transaction(i * 1.5))
                .toList();

        List<Integer> filtered = transactions.stream()
                .filter(t -> t.getValue() > 100)
                .sorted(Comparator.comparing(Transaction::getDate))
                .map(Transaction::getId)
                .toList();

        System.out.println(filtered);
    }
}
