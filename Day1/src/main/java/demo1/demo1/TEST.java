package demo1.demo1;

import java.util.*;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TEST {

    // @RequestMapping(value = "/firstpage", method = RequestMethod.GET)

    @GetMapping("/{num}")
    public String hello(@PathVariable int num) {
        return "The square of " + num + " is " + (num * num) + "!";
    }

}
