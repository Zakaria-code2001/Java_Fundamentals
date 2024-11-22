package streams;

import java.util.List;

public class StreamOperations {
    static List<String> veggies = List.of(
            "spinach",
            "cabbage",
            "green beans",
            "peach",
            "brussels sprouts"
            );

    public static void main(String[] args) {
        anyMatchDemo();
    }

    public static void anyMatchDemo(){
        boolean anyMatches = veggies.stream().anyMatch(v -> v.contains(" "));
        System.out.println(anyMatches);
    }

    public static void allMatchDemo(){
        boolean allMatches = veggies.stream().allMatch(v -> v.contains("s"));
        System.out.println(allMatches);
    }
}
