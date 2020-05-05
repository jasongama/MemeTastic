package com.justinpackage.Joke;

public class Joke {
    public  String  joke  = " Why are pirates called pirates? Because they arrrr!";

    protected void changeJoke(String newJoke){

        this.joke = newJoke;
    }
    public String getJoke(){
        return this.joke;
    }




    public Joke(){

    }
    public Joke(String joke){
        this.changeJoke(joke);


    }
}