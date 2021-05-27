package br.com.vorthrox.myinvest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.vorthrox.myinvest.domain.Investimento;

public interface InvestimentoRepository extends JpaRepository<Investimento, Long>{
	

}
