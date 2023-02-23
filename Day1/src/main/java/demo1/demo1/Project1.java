package demo1.demo1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Project1 {

    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome ";
    }

    @RequestMapping(value = "/name/{name}", method = RequestMethod.GET)
    public String getName(@PathVariable String name) {
        return " Your Name is " + name + "! That's cool!😎";
    }

    @RequestMapping(value = "/myFav/{color}", method = RequestMethod.GET)
    public String getMyFav(@PathVariable String color) {
        return "My Favourite Color is " + color;
    }
}
