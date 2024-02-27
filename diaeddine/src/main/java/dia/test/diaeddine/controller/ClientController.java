package dia.test.diaeddine.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dia.test.diaeddine.entities.Client;
import dia.test.diaeddine.service.ClientService;
import dia.test.diaeddine.service.RandomNumberService;
import lombok.AllArgsConstructor;

@RequestMapping("client")
@RestController

public class ClientController {
    @Autowired
    private ClientService clientService;
    @Autowired
    private RandomNumberService randomNumberService;

    @PostMapping("/predicted")
    public void SetNumber(@RequestBody Client client)
    {
        randomNumberService.save(client.getRandomNumber());
        clientService.save(client);
    }
    @GetMapping
    public List<Client> findAll(){
        return clientService.findAll();
    }
}
