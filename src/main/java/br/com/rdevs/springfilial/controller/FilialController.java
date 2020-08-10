package br.com.rdevs.springfilial.controller;

import br.com.rdevs.springfilial.model.dto.FilialDTO;
import br.com.rdevs.springfilial.service.FilialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FilialController {

    @Autowired
    private FilialService service;

    @GetMapping("/filiais")
    public List<FilialDTO> buscarTodas() {
        return service.buscarTodas();
    }

    @GetMapping("/filiais/{cdFilial}")
    public FilialDTO buscarPorId(@PathVariable("cdFilial") Integer cdFilial) {
        return service.buscarPorId(cdFilial);
    }
}
