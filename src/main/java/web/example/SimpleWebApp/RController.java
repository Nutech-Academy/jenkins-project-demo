package web.example.SimpleWebApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Controller
 */

@Controller
public class RController{

  @RequestMapping("/home")
  public String getHomepage(){
    return "homepage";
  }
  
}
