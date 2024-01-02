package microservice.com.agenda.domain.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import microservice.com.agenda.domain.entities.Usuario;

@Repository
public interface UsuarioRepository  extends JpaRepository<Usuario, Long>{
   
    public Optional<Usuario> findByUsuario(String usuario);
}
