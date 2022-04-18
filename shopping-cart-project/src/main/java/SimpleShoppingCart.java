import java.util.ArrayList;
import java.util.stream.Collectors;

public class SimpleShoppingCart extends AbstractShoppingCart {

    public SimpleShoppingCart() {

        products = new ArrayList<>();
    }

    public double checkOut() {
        return products.stream().collect(Collectors.summingDouble(product -> product.getPrice()));
    }
}
