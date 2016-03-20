package example.model.com.example;


/**
 * Created by haljik on 2016/03/20.
 */
public class LineItem {
    private Item item = new Item();
    private Quantity quantity = Quantity.ofNone();

    public TotalAmount totalAmount() {
        return item.amount(quantity);
    }
}
