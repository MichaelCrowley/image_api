package CrowleyImageAPI;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ImageController{

    @RequestMapping("/image")
    public Image image(){
        return new Image("0000000000000001");
    }
}