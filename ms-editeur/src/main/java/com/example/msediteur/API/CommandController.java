package com.example.msediteur.API;

import com.example.coreapi.DTO.EditeurDTO;
import com.example.coreapi.commands.EditeurCreationCommand;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.CompletableFuture;

@RestController
@RequestMapping("command")
public class CommandController {

    @Autowired
    CommandGateway commandGateway;

    @PostMapping("editeur")
    public CompletableFuture<String> addEditeur(@RequestBody EditeurDTO editeurDTO){

        CompletableFuture<String> response=commandGateway.send(
                new EditeurCreationCommand(editeurDTO.getEditeurId(),
                        editeurDTO.getName(),
                        editeurDTO.getPays()));

        return response;
    }

}
