package strategy;

// Implementación de PriceCalculator para Spotify
public class SpotifyPriceCalculator implements PriceCalculator {
    @Override
    public float calculatePrice() {
        return 50; // Precio para Spotify
    }
}
