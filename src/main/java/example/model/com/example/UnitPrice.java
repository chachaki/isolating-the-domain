package example.model.com.example;

import java.math.BigDecimal;

/**
 * Created by haljik on 2016/03/20.
 */
public class UnitPrice {
    BigDecimal number;
    public TotalAmount multiply(Quantity quantity) {
        final BigDecimal total = number.multiply(quantity.value());
        return new TotalAmount(total);
    }
}
