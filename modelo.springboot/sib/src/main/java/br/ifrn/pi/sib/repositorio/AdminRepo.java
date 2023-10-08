package br.ifrn.pi.sib.repositorio;

import br.ifrn.pi.sib.models.Admin;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


public interface AdminRepo extends CrudRepository<Admin, Integer> {
    @Query (value = "SELECT CASE WHEN COUNT(1)> 0 THEN 'true' ELSE 'false' END from admins where id = :id", nativeQuery = true)
    public boolean exist(int id);
}
