package observer.example;

import observer.UsuarioRepositorio;

public class ObservedApp2 {

    public static   void main (String[] args){
        UsuarioRepositorio repo  = new UsuarioRepositorio();
        repo.addObserver(( o,u)  -> System.out.println("Enviar mail al usuario "+u));
        repo.addObserver(( o,u) -> System.out.println("Enviar mail al administrador"));
        repo.addObserver(( o,u) -> System.out.println("Guardando info del usuario " +u+" en el log"));
        repo.crearUsuario("Andres");
        repo.crearUsuario("Pablo");
    }
}
