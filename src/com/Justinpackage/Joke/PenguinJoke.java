package com.Justinpackage.Joke;
public class PenguinJoke extends Joke {

    public void printJoke(){
        System.out.println(this.getJoke() + " Why was the pirate ship so cheap? It was on sail!");

    }

    public PenguinJoke(){

    }

    public PenguinJoke(String joke){
        super(joke);
    }
}
