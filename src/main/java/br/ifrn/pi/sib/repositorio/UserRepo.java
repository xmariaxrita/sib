package br.ifrn.pi.sib.repositorio;

import br.ifrn.pi.sib.models.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<User, Integer> {
    @Query(value = "SELECT CASE WHEN COUNT(1)> 0 THEN 'true' ELSE 'false' END from users where id = :id", nativeQuery = true)
    public boolean exist(int id);

    @Query(value = "SELECT * FROM users WHERE email = :email AND senha = :senha", nativeQuery = true)
    public User Login(String email, String senha);
}
