package com.justinpackage.Joke;

public class SecondJoke extends Joke {


    public  String  joke  = " What kind of grades does a pirate get in school? High seas!";
    protected final void changeJoke(String newJoke){

        this.joke = newJoke;
    }
    public final String getJoke(){
        return this.joke;
    }

    public SecondJoke(){

    }
    public SecondJoke(String joke){
        super(joke);
    }

}
