package br.com.vieiravictor.springbootandmysql.repository;

import br.com.vieiravictor.springbootandmysql.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

}
