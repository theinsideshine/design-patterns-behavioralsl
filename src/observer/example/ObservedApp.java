package observer.example;

import observer.Corporacion;

public class ObservedApp {

    public static   void main (String[] args){
        Corporacion google =  new Corporacion("Google",1000);
        google.addObserver(( observable, obj)  -> {
            System.out.println("John: "+ observable);
        });

        google.addObserver(( observable, obj) -> {
            System.out.println("Andres: "+ observable);
        });


        google.addObserver(( observable, obj) -> {
            System.out.println("Maria: "+ observable);
        });

        google.modificaPrecio(2000);


    }
}
