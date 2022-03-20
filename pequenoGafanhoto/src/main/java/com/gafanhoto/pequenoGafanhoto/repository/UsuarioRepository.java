package com.gafanhoto.pequenoGafanhoto.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gafanhoto.pequenoGafanhoto.model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository <Usuario, Long>{
	
	public Optional<Usuario> findByUsuarioContainingIgnoreCase(String usuario);


	}

