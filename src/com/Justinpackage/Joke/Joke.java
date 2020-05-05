package com.Justinpackage.Joke;

public class Joke {
    public  String  joke  = " What did one pirate say to another during a game of hide-and-seek? I sea you!";

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