package example.model.com.example;

import java.math.BigDecimal;

/**
 * Created by haljik on 2016/03/20.
 */
public class StringNumber {
    private BigDecimal number = new BigDecimal("0");
    private String text = "";
    private boolean valid = true;

    public StringNumber(String number) {
        try {
            this.number = new BigDecimal(text);
        } catch (NumberFormatException e) {
            valid = false;
            //なにもしない
        }
        this.text = text;
    }

    public StringNumber(BigDecimal number) {
        this.number = number;
    }

    @Override
    public String toString() {
        if (valid) return number.toString();
        return text;
    }

    //For MyBatis
    StringNumber() {
    }


    //For Collection
    @Override
    public boolean equals(Object other) {
        if (other instanceof Quantity)
            return this.number.equals(((StringNumber) other).number);
        return false;
    }

    @Override
    public int hashCode() {
        return number.hashCode();
    }
}
