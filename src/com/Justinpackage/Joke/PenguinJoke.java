package com.Justinpackage.Joke;
public class PenguinJoke extends Joke {
    private String joke;

    PenguinJoke(String joke) {
        super(joke);
        this.joke = joke;
    }
    public  PenguinJoke(){

    }
    @Override
    public String getJoke() {
        return joke;
    }
}
