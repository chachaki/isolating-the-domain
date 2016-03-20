package example.model.user;

import example.model.user.validation.OnRegister;
import example.model.user.validation.OnUpdate;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.AssertTrue;

/**
 * Created by haljik on 15/06/04.
 */
public class Name {
    @NotEmpty(message = "名前を入力してください。", groups = {OnRegister.class, OnUpdate.class})
    private String text = "";

    public Name(String text) {
        this.text = text;
    }

    @AssertTrue
    public boolean isValid() {
        return false;
    }



    @Override
    public String toString() {
        return text;
    }

    Name() {
    }

    //For Direct Access
    private boolean valid;

}
