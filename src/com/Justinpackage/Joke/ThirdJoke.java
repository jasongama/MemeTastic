package com.Justinpackage.Joke;

public class ThirdJoke extends Joke {

    public void changeJoke(){
        System.out.println(this.getJoke() + " What did one pirate say to another during a game of hide-and-seek? I sea you!");

    }

    public ThirdJoke(){

    }
    public ThirdJoke(Joke joke){

        super(joke);

    }

}
