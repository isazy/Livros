package com.LivrosAtivd.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.LivrosAtivd.entities.*;

public interface LivroRepository extends JpaRepository<Livro, Long> {

}
