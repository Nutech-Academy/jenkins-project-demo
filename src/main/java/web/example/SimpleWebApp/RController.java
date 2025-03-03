package web.example.SimpleWebApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * Controller
 */

@Controller
public class RController{

  @GetMapping("/home")
  public String getHomepage(){
    return "homepage";
  }

  @PostMapping("/post-something")
  public String postSomething(){
    return "post";
  }
  
}
