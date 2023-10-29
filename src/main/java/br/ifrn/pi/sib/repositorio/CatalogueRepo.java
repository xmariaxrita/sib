package br.ifrn.pi.sib.repositorio;

import br.ifrn.pi.sib.models.Catalogue;
import org.springframework.data.repository.CrudRepository;

public interface CatalogueRepo extends CrudRepository<Catalogue, Integer> {
}

