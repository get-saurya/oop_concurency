package org.example.streamandlambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(1, 5, 2, 9, 7, 10, 8, 6, 4, 3);

        /*List<Integer> oddNumbers = new ArrayList<>();
        //Filter operation on List of integers
        for (Integer num : numbers) {
            if (num % 2 == 1) oddNumbers.add(num);
        }*/

        //streams
        Stream<Integer> stream = numbers.stream();
        List<Integer> oddNumbers = stream.filter((x) -> x % 2 == 1).toList(); // Filter is Intermediate method.
        //collect(), toList(), findFirst(), are example of terminal functions of stream
        System.out.println(oddNumbers);

        Stream<Integer> stream1 = numbers.stream();
        List<Integer> output =
                stream1
                        .filter((x) -> x%2==1) //Intermediary functions like filter, map, sorted on stream data
                        .map((x) -> x*x)
                        .sorted()
                        .toList();

       //System.out.println(output);

        //Stream<Integer> stream2 = numbers.stream();  //instead of create new object of stream of numbers.stream()
        Optional<Integer> optionalI = numbers.stream()
                                            .filter((x) -> {
                                                System.out.println("Filtering: "+x);
                                                return x%2==1;
                                            })
                                            .map(x -> {
                                                System.out.println("Mapping: "+x);
                                                return x*x;
                                            })
                                            .findFirst();
        if (optionalI.isPresent()) {
            System.out.println(optionalI.get());
        }


    }
}
