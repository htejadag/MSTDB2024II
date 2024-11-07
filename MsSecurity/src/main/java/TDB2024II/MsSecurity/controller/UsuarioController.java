package TDB2024II.MsSecurity.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import TDB2024II.MsSecurity.model.UsuarioModel;
import TDB2024II.MsSecurity.services.UsuarioService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("usuario")
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;
    
    @GetMapping("/findAll")
    public List<UsuarioModel> FindAll()
    {
        List<UsuarioModel> lista = usuarioService.findAll();
        return lista;
    }

    @PostMapping("/create")
    public UsuarioModel create(@RequestBody UsuarioModel model)
    {   
        return usuarioService.add(model);
    }

    // findById

    // update

    // eliminar
    
}
