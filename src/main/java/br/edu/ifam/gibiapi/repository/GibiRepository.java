package br.edu.ifam.gibiapi.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.edu.ifam.gibiapi.entity.Gibi;

@RepositoryRestResource(collectionResourceRel = "gibi", path = "meugibi")
public interface GibiRepository extends PagingAndSortingRepository<Gibi, Long>{

}
