package strategy.example;

import strategy.Partner;
import strategy.SubscriptionDTO;

public class strategyApp {
    public static void main(String[] args) {
        // Crear instancias de SubscriptionDTO con diferentes socios
        SubscriptionDTO disneySubscription = new SubscriptionDTO(1L, Partner.DISNEY);
        SubscriptionDTO netflixSubscription = new SubscriptionDTO(2L, Partner.NETFLIX);
        SubscriptionDTO spotifySubscription = new SubscriptionDTO(3L, Partner.SPOTIFY);

        // Mostrar los precios de las suscripciones
        System.out.println("Precio de la suscripción a Disney: $" + disneySubscription.getPrice());
        System.out.println("Precio de la suscripción a Netflix: $" + netflixSubscription.getPrice());
        System.out.println("Precio de la suscripción a Spotify: $" + spotifySubscription.getPrice());
    }
}
