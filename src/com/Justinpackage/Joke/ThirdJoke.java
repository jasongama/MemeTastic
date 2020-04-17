package com.Justinpackage.Joke;

public class ThirdJoke extends Joke {
    private String joke;
    ThirdJoke(String joke) {
        super(joke);
        this.joke =joke;
    }
    public ThirdJoke() {

    }
    @Override
    public String getJoke() {
        return joke;
    }
}
