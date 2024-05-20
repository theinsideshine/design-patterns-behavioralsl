package strategy;

public class SubscriptionDTO {
    private Long id;
    private Partner partner;
    private float price; // Precio de la suscripción

    public SubscriptionDTO() {
        // Constructor vacío
    }

    public SubscriptionDTO(Long id, Partner partner) {
        this.id = id;
        this.partner = partner;
        this.price = calculatePrice(); // Calculamos el precio usando Strategy
    }

    // Método para calcular el precio utilizando Strategy
    private float calculatePrice() {
        // Seleccionar el PriceCalculator adecuado según el socio
        PriceCalculator calculator;
        switch (partner) {
            case DISNEY:
                calculator = new DisneyPriceCalculator();
                break;
            case NETFLIX:
                calculator = new NetflixPriceCalculator();
                break;
            case SPOTIFY:
                calculator = new SpotifyPriceCalculator();
                break;
            default:
                // Si el socio no se reconoce, retornamos cero
                return 0;
        }
        // Calcular el precio usando la estrategia seleccionada
        return calculator.calculatePrice();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Partner getPartner() {
        return partner;
    }

    public void setPartner(Partner partner) {
        this.partner = partner;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
