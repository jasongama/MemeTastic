package com.Justinpackage.Joke;

public class Memes {
    private String jokeMessage = "--";
    private String emoji = "---";

    public static void main(String[] args) {
      Joke thePenguinJoke = new PenguinJoke();
      SecondJoke  penguinJoke = new SecondJoke();

        Memes meme = new Memes();


        meme.setJoke(thePenguinJoke);
        meme.setJoke(penguinJoke);
        meme.setImage();

        System.out.println(meme.showMessage());

    }

    private void setJoke(Joke joke) {

        if (joke instanceof PenguinJoke) {
            jokeMessage = "What did the sea say to the penguin? Nothing, it just waved.";

        }
        if (joke instanceof SecondJoke) {

            jokeMessage = " How do penguins make a decision? Flipper coin.";
        }

    }
    private void setImage() {

        this.emoji = "\uD83D\uDC27";
    }

    private String showMessage() {

        return emoji + jokeMessage;
    }
}
