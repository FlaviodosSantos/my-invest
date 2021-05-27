package br.com.vorthrox.myinvest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.vorthrox.myinvest.domain.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{

}
