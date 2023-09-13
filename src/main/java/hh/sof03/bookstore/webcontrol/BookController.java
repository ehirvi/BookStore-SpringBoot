package hh.sof03.bookstore.webcontrol;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class BookController {

    @GetMapping("/index")
    public String frontPage() {
        return "frontpage";
    }

}
