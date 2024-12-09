package com.spark.betaSite.web.controllers;


import com.spark.betaSite.web.dto.boxDTO;
import com.spark.betaSite.models.Box;
import com.spark.betaSite.services.boxServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1")
@AllArgsConstructor
public class boxController {

    private final boxServiceImpl boxService;

    @GetMapping("/boxes")
    public List<Box> getBoxes() {
        return boxService.getList();
    }


    @PostMapping(value = "/boxes/save", produces = MediaType.APPLICATION_JSON_VALUE)
    public Box saveBox(@RequestBody boxDTO boxDTO) {
        return boxService.saveBox(boxDTO);
    }

    @GetMapping("/boxes/{id}")
    public Box findById(@PathVariable Long id) {
        return boxService.getById(id);
    }
}
