package com.justinpackage.Joke;

public class ThirdJoke extends Joke {

    public  String  joke  = " How much did the pirate pay for his peg and hook? An arm and a leg!";
    protected  void changeJoke(String newJoke){

        this.joke = newJoke;
    }
    public  String getJoke(){
        return this.joke;
    }

    public ThirdJoke(){

    }
    public ThirdJoke(String joke){

        super(joke);

    }

}
