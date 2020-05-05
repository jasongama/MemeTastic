package com.justinpackage.Joke;
public class PenguinJoke extends Joke {

    public  String  joke  = " How do penguins make a decision? Flipper coin.";
    protected final void changeJoke(String newJoke){

        this.joke = newJoke;
    }
    public final String getJoke(){
        return this.joke;
    }

    public PenguinJoke(){

    }

    public PenguinJoke(String joke){
        super(joke);

    }
}
