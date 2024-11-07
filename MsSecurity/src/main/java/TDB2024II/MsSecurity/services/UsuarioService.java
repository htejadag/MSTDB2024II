package TDB2024II.MsSecurity.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import TDB2024II.MsSecurity.model.UsuarioModel;
import TDB2024II.MsSecurity.repository.IUsuarioRepository;

public class UsuarioService implements IUsuarioService {

    @Autowired
    IUsuarioRepository repository;

    @Override
    public List<UsuarioModel> findAll() {
        return (List<UsuarioModel>)repository.findAll();
    }

    @Override
    public UsuarioModel findById(Integer id) {
        return (UsuarioModel)repository.findById(id).get();
    }

    @Override
    public UsuarioModel add(UsuarioModel model) {
        return repository.save(model);
    }

    @Override
    public UsuarioModel update(UsuarioModel model) {
        return repository.save(model);
    }

    @Override
    public Boolean delete(Integer id) {
        repository.deleteById(id);
        return true;
    }
    
}
