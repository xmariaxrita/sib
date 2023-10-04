package br.edu.ifrn.SIB.repositories;

import br.edu.ifrn.SIB.models.Livro;
import org.springframework.data.repository.CrudRepository;

public interface LivroRepository extends CrudRepository<Livro, Integer> {
}
