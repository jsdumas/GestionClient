package fr.treeptik.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import fr.treeptik.model.Client;

//Pas de @Repostory : pas sur les interface spring l'implémente
public interface ClientDAO extends JpaRepository<Client, Integer>{
	
	Page<Client> findAll(Pageable page);
	
//	@Query("select c from Client c where c.nom = :nom")
	List<Client> findByNom(String nom);
	

}



