 package com.Justinpackage;
import com.Justinpackage.Joke.Joke;
import com.Justinpackage.Joke.PenguinJoke;
import com.Justinpackage.Joke.ThirdJoke;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;


 public class MemeTest {
    @Test
    protected void shouldTellPenguinJoke() {

        Joke joke = new PenguinJoke();
        joke.getJoke();
        assertEquals(" How do penguins make a decision? Flipper coin.", joke.getJoke());
    }


}
