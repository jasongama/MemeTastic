package com.Justinpackage.Joke;

public class ThirdJoke extends Joke {

    public  String  joke  = " Why couldn't the pirate crew play cards?";
    protected final void changeJoke(String newJoke){

        this.joke = newJoke;
    }
    public final String getJoke(){
        return this.joke;
    }

    public ThirdJoke(){

    }
    public ThirdJoke(String joke){

        super(joke);

    }

}
