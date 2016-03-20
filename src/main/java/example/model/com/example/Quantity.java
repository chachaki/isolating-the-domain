package example.model.com.example;

import java.math.BigDecimal;

/**
 * Created by haljik on 2016/03/20.
 */
public class Quantity {
    private BigDecimal number = new BigDecimal("0");

    public Quantity(BigDecimal number) {
        this.number = number;
    }

    //事前条件として計算可能な値であること
    public Quantity multiply(Quantity quantity) {
        return new Quantity(this.number.multiply(quantity.number));
    }

    public TotalAmount totalAmount(UnitPrice price) {
        return new TotalAmount(number.multiply(price.number));
    }

    //For Spring MVC Binding
    private String text = "";
    private boolean valid = true;

    public Quantity(String text) {
        try {
            this.number = new BigDecimal(text);
        } catch (NumberFormatException e) {
            valid = false;
            //なにもしない
        }
        this.text = text;
    }

    @Override
    public String toString() {
        if (valid) return number.toString();
        return text;
    }

    //For MyBatis
    Quantity() {
    }

    //For Collection
    @Override
    public boolean equals(Object other) {
        if (other instanceof Quantity)
            return this.number.equals(((Quantity) other).number);
        return false;
    }

    @Override
    public int hashCode() {
        return number.hashCode();
    }

    public static Quantity ofNone() {
        return new Quantity();
    }

    public boolean isNone() {
        //Quantityなら0が未設定という判定はできる
        return this.number.equals(BigDecimal.ZERO);
    }

    BigDecimal value() {
        return number;
    }
}
