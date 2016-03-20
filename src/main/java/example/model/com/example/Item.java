package example.model.com.example;

/**
 * Created by haljik on 2016/03/20.
 */
public class Item {
    UnitPrice unitPrice;

    public TotalAmount amount(Quantity quantity) {
        return unitPrice.multiply(quantity);
    }
}
