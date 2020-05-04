package com.Justinpackage.Joke;

  public class Meme {
    private String image;
    private Joke joke;
   public static void main(String[] args){

      Joke thePenguinJoke = new PenguinJoke();

            Meme meme = new Meme();
            meme.setJoke(thePenguinJoke);
            meme.setImage("\uD83D\uDC27" );
            System.out.println(meme.showMessage());
   }



      public void setJoke(Joke thePenguinJoke) {
          this.joke = thePenguinJoke;

      }


      public void setImage(String image) {
          this.image = image;
      }

      public String showMessage() {

          return image + joke.getJoke();
      }

  }
