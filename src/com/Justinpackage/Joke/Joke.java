package com.Justinpackage.Joke;

public class Joke {
    public Joke joke;

    protected final void changeJoke(Joke newJoke){

        this.joke = newJoke;
    }
    protected final Joke getJoke(){
        return this.joke;
    }




    public Joke(){

    }
    public Joke(Joke joke){
        this.changeJoke(joke);


    }
}