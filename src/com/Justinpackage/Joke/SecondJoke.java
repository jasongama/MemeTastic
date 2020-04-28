package com.Justinpackage.Joke;

public class SecondJoke extends Joke {

    public void printJoke(){
        System.out.println(this.getJoke() + " How do penguins make a decision? Flipper coin.");

    }

    public SecondJoke(){

    }
    public SecondJoke(String joke){
        super(joke);
    }

}
