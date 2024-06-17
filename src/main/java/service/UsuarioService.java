package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import model.Usuario;
import repository.UsuarioRepository;
import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<Usuario> getAllUsuarios() {
        return usuarioRepository.findAll();
    }

    public Usuario getUsuarioById(Long id) {
        return usuarioRepository.findById(id).orElse(null);
    }

    public Usuario saveOrUpdateUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }
    public Usuario updateUsuario(Long id, Usuario novoUsuario) {
        Usuario usuarioExistente = usuarioRepository.findById(id).orElse(null);
        if (usuarioExistente != null) {
            // Atualiza os dados do usuário existente com os dados do novo usuário
            usuarioExistente.setNome(novoUsuario.getNome());
            usuarioExistente.setEmail(novoUsuario.getEmail());
            usuarioExistente.setSenha(novoUsuario.getSenha());

            // Salva o usuário atualizado no repositório
            return usuarioRepository.save(usuarioExistente);
        } else {
            return null; // Retornar null ou lançar uma exceção, dependendo do requisito
        }
    }

    public void deleteUsuario(Long id) {
        usuarioRepository.deleteById(id);
    }
}

