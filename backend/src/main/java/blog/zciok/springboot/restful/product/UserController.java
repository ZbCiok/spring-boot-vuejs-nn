package blog.zciok.springboot.restful.product;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
    @GetMapping("/")
    public String list() {
        return "users";
    }
}
