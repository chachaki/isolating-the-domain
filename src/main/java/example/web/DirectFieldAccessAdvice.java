package example.web;

import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.InitBinder;

/**
 * Created by haljik on 2016/03/20.
 */
@ControllerAdvice
public class DirectFieldAccessAdvice {

    @InitBinder
    void init(WebDataBinder binder) {
        binder.initDirectFieldAccess();
        binder.setAllowedFields("need to set");
    }

}
