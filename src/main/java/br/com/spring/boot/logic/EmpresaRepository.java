package br.com.spring.boot.logic;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.spring.boot.impl.Empresa;

public interface EmpresaRepository extends JpaRepository<Empresa, Long>{
	Empresa findByCnpj(String cnpj);
}