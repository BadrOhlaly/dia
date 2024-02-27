package dia.test.diaeddine.controller;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/number")
public class RandomNumberController {

    @GetMapping("/random")
    public int getrandomnumber(){

        return (int) (Math.random()*10)+1;

    }

}
