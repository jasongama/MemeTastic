package com.Justinpackage.Joke;

  public class Meme {
    private String image;
    private String joke;
   public static void main(String[] args){

      Joke thePenguinJoke = new PenguinJoke();

            Meme meme = new Meme();
            meme.setJoke(thePenguinJoke);
            meme.setImage("\uD83D\uDC27" );
            System.out.println(meme.showMessage());
   }




      private void setJoke(Joke thePenguinJoke) {
          thePenguinJoke.printJoke();

      }


      public void setImage(String image) {
          this.image = image;
      }

      public String showMessage() {

          return image;
      }

  }
