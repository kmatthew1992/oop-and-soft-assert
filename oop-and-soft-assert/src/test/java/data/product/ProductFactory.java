package data.product;

public class ProductFactory {
    public static Product getExpectedProduct(ProductType productType) {
        Product product = new Product();
        switch (productType) {
            case BIKE -> {
                product.setTitle("Sauce Labs Bike Light");
                product.setDescription("gahjhf");
            }
            case BACKPACK -> {
                product.setTitle("Backpack");
                product.setDescription("gfjsifhojsfahjhf");
            }
            default -> throw new RuntimeException();
        }
        return product;
    }
}
