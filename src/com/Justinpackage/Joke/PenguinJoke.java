package com.Justinpackage.Joke;
public class PenguinJoke extends Joke {

    public void changeJoke(String joke){
        System.out.println(this.getJoke() + " What did one pirate say to another during a game of hide-and-seek? I sea you!");

    }

    public PenguinJoke(){

    }

    public PenguinJoke(String joke){
        super(joke);

    }
}
