package org.springtech.springboard;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/computers")
public class ComputersController {
    @GetMapping
    public List<Computers> getAll(){
        return List.of(
                new Computers("Lenovo", "Zorin OS", "ThinkPad", 4),
                new Computers("Lenovo", "Ubuntu OS", "ThinkBook", 8),
                new Computers("Lenovo", "Windows OS", "Legion", 16)
        );
    }
}
