package example.model.user;

import javax.validation.Valid;

/**
 * Created by haljik on 15/06/04.
 */
public class User {
    @Valid
    UserId id;
    @Valid
    Name name;
    @Valid
    BirthDate birthDate;
    @Valid
    PhoneNumber phoneNumber;
    Password password;

    public boolean hasSamePassword(Password password) {
        return password.hasSameValue(password);
    }
}
