package com.Justinpackage.Joke;

public class Joke {
    public String joke;

    protected void changeJoke(String newJoke){

        this.joke = newJoke;
    }
    protected final String getJoke(){
        return this.joke;
    }




    public Joke(){

    }
    public Joke(String joke){
        this.changeJoke(joke);


    }
}