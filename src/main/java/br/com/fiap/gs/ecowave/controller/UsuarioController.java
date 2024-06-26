package br.com.fiap.gs.ecowave.controller;

import br.com.fiap.gs.ecowave.dto.UsuarioDTO;
import br.com.fiap.gs.ecowave.model.Usuario;
import br.com.fiap.gs.ecowave.repository.UsuarioRepository;
import br.com.fiap.gs.ecowave.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @Autowired
    private UsuarioRepository usuarioRepository;


    @CrossOrigin(origins = "http://localhost:8081")
    @GetMapping
    public List<UsuarioDTO> getAllUsuarios() {
        return usuarioService.getAllUsuarios();
    }


    @CrossOrigin(origins = "http://localhost:8081")
    @PostMapping
    public Usuario createUsuario(@RequestBody Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    @CrossOrigin(origins = "http://localhost:8081")
    @GetMapping("/{id}")
    public Usuario getUsuarioById(@PathVariable Long id) {
        return usuarioRepository.findById(id).orElseThrow(() -> new RuntimeException("Usuário não encontrado"));
    }

    @CrossOrigin(origins = "http://localhost:8081")
    @PutMapping("/{id}")
    public Usuario updateUsuario(@PathVariable Long id, @RequestBody Usuario usuarioDetails) {
        Usuario usuario = usuarioRepository.findById(id).orElseThrow(() -> new RuntimeException("Usuário não encontrado"));
        usuario.setEmail(usuarioDetails.getEmail());
        usuario.setNome(usuarioDetails.getNome());
        usuario.setSenha(usuarioDetails.getSenha());
        return usuarioRepository.save(usuario);
    }

    @CrossOrigin(origins = "http://localhost:8081")
    @DeleteMapping("/{id}")
    public void deleteUsuario(@PathVariable Long id) {
        Usuario usuario = usuarioRepository.findById(id).orElseThrow(() -> new RuntimeException("Usuário não encontrado"));
        usuarioRepository.delete(usuario);
    }
}
