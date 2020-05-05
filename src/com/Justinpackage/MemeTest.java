 package com.justinpackage;
import com.justinpackage.Joke.*;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;


 public class MemeTest {
    @Test
    protected void shouldTellAPenguinJoke() {

        Joke joke = new PenguinJoke();

        joke.getJoke();
        assertEquals(" How do penguins make a decision? Flipper coin.", joke.getJoke());
    }
     @Test
     public void shouldTellAThirdJoke() {

         Joke joke = new ThirdJoke();

         joke.getJoke();
         assertEquals(" How much did the pirate pay for his peg and hook? An arm and a leg!", joke.getJoke());
     }

     @Test
     public void shouldTellASecondPenguinJoke() {

         Joke joke = new SecondJoke();

         joke.getJoke();
         assertEquals(" What kind of grades does a pirate get in school? High seas!", joke.getJoke());
     }

     @Test
     public void Memes() {
        Joke joke = new PenguinJoke();
         Meme meme = new Meme();
         meme.setJoke(joke);
         meme.setImage("\uD83D\uDC27");
         assertEquals("\uD83D\uDC27 How do penguins make a decision? Flipper coin.", meme.showMessage());
     }
     @Test
     public void MemeSecondJoke() {
         Joke joke = new SecondJoke();
         Meme meme = new Meme();
         meme.setJoke(joke);
         meme.setImage("\uD83D\uDC27");
         assertEquals("\uD83D\uDC27 What kind of grades does a pirate get in school? High seas!", meme.showMessage());
     }
     @Test
     public void MemeThirdJoke() {
         Joke joke = new ThirdJoke();
         Meme meme = new Meme();
         meme.setJoke(joke);
         meme.setImage("\uD83D\uDC27");
         assertEquals("\uD83D\uDC27 How much did the pirate pay for his peg and hook? An arm and a leg!", meme.showMessage());
     }

 }
