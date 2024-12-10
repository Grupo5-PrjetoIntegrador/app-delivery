package com.grupo5.appdelivery.repository;

<<<<<<< HEAD
public interface UsuarioRepository{
=======
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.grupo5.appdelivery.model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
>>>>>>> 14382ff90687fc68bdf2e6112ca26bd2ddd59911

}
