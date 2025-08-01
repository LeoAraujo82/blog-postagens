package com.blog.postagens;

import com.blog.postagens.entities.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

public interface AutorRepository extends JpaRepository<Autor, Integer> {
}
