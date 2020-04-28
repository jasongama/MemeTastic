package com.Justinpackage.Joke;

public class Joke {
    private String joke;

    protected final void changeJoke(String newJoke){
        this.joke = newJoke;
    }
    protected final String getJoke(){
        return this.joke;
    }

    public void printJoke(){
        System.out.println(this.joke + " Sharing good jokes");
    }

    public Joke(){

    }
    public Joke(String joke){
        this.changeJoke(joke);


    }
}