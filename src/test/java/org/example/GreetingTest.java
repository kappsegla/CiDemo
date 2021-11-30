package org.example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GreetingTest {

    @Test
    void callingGreetingWithEmptyNameShouldReturnHello() {
        Greeting greeting = new Greeting();

        var result = greeting.greet("");

        assertThat(result).isEqualTo("Hello");
    }
}
