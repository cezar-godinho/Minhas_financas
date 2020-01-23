package service.impl;

import exception.RegraNegocioException;
import model.entity.Usuario;
import model.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService {


    private UsuarioRepository repository;

    @Autowired
    public UsuarioServiceImpl(UsuarioRepository repository) {
        this.repository = repository;
    }

    @Override
    public Usuario autenticar(String email, String senha) {
        return null;
    }

    @Override
    public Usuario salvarUsuario(Usuario usuario) {
        return null;
    }

    @Override
    public void validarEmail(String email) {

        boolean existe = repository.existsByEmail(email);
        if(existe){
            throw new RegraNegocioException("Já existe um usuario cadastrado com esse email");
        }
    }
}
