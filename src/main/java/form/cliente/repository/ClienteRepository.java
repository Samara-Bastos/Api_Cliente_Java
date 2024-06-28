package form.cliente.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import form.cliente.entity.Cliente;
import java.util.Optional;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
   List<Cliente> findAll();
   Optional<Cliente> findByEmail(String email);
}
