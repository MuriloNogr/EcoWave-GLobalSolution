package br.com.fiap.gs.ecowave.controller;

import br.com.fiap.gs.ecowave.dto.LixoDTO;
import br.com.fiap.gs.ecowave.service.LixoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/lixo")
public class LixoController {
    @Autowired
    private LixoService lixoService;

    @CrossOrigin(origins = "http://localhost:8081")
    @GetMapping
    public List<LixoDTO> getAllLixos() {
        return lixoService.getAllLixos();
    }

    @CrossOrigin(origins = "http://localhost:8081")
    @GetMapping("/{id}")
    public LixoDTO getLixoById(@PathVariable Long id) {
        return lixoService.getLixoById(id);
    }

    @CrossOrigin(origins = "http://localhost:8081")
    @PostMapping
    public LixoDTO createLixo(@RequestBody LixoDTO lixoDTO) {
        return lixoService.saveLixo(lixoDTO);
    }

    @CrossOrigin(origins = "http://localhost:8081")
    @PutMapping("/{id}")
    public LixoDTO updateLixo(@PathVariable Long id, @RequestBody LixoDTO lixoDTO) {
        return lixoService.updateLixo(id, lixoDTO);
    }

    @CrossOrigin(origins = "http://localhost:8081")
    @DeleteMapping("/{id}")
    public void deleteLixo(@PathVariable Long id) {
        lixoService.deleteLixo(id);
    }
}
