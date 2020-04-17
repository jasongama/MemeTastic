package com.Justinpackage.Joke;

public class SecondJoke extends Joke {
    private String joke;
    SecondJoke(String joke) {
        super(joke);
        this.joke =joke;
    }
    public SecondJoke(){

    }
    @Override
    public String getJoke() {
        return joke;
    }
}
