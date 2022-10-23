package Recap.recap7;

public class Country {

      public Country(){
          System.out.println("Country class constructor");
        }

        public String name;
        protected String capital;
        int population;
        private String president;

        Country(String name){
            this.name=name;
        }
    }
