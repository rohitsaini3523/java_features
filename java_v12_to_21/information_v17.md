# Java version: 17
1. **Sealed Classes (Final)**: Make sealed classes feature final.
    ```
    // Example of Pattern Matching for Switch
    String result = switch (obj) {
        case Integer i -> "It's an Integer: " + i;
        case String s && s.length() > 5 -> "It's a String with length greater than 5.";
        default -> "It's something else.";
    };
    System.out.println(result);

    ```
2. **Pattern Matching for Switch (Standard)**: Allow pattern matching in switch 