package co.develhope.democontrollercongetacompleta;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v2")
public class ControllerConGETCompleta {
    //localhost:8080/v2/ciao?nome=Giuseppe&provincia=Lombardia
    @GetMapping("ciao")
    public User ritornaInfo(@RequestParam String nome, @RequestParam String provincia) {
        return new User(nome, provincia);
    }
}
