package br.ifrn.pi.sib.repositorio;

import br.ifrn.pi.sib.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<User, Integer> {
}
