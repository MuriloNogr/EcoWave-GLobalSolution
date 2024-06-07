package br.com.fiap.gs.ecowave.controller;

import br.com.fiap.gs.ecowave.dto.EspecieDTO;
import br.com.fiap.gs.ecowave.service.EspecieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/especies")
public class EspecieController {
    @Autowired
    private EspecieService especieService;

    @CrossOrigin(origins = "http://localhost:8081")
    @GetMapping
    public List<EspecieDTO> getAllSpecies() {
        return especieService.getAllSpecies();
    }

    @CrossOrigin(origins = "http://localhost:8081")
    @GetMapping("/{id}")
    public EspecieDTO getEspecieById(@PathVariable Long id) {
        return especieService.getEspecieById(id);
    }

    @CrossOrigin(origins = "http://localhost:8081")
    @PostMapping
    public EspecieDTO createEspecie(@RequestBody EspecieDTO especieDTO) {
        return especieService.saveEspecie(especieDTO);
    }

    @CrossOrigin(origins = "http://localhost:8081")
    @PutMapping("/{id}")
    public EspecieDTO updateEspecie(@PathVariable Long id, @RequestBody EspecieDTO especieDTO) {
        return especieService.updateEspecie(id, especieDTO);
    }

    @CrossOrigin(origins = "http://localhost:8081")
    @DeleteMapping("/{id}")
    public void deleteEspecie(@PathVariable Long id) {
        especieService.deleteEspecie(id);
    }
}
