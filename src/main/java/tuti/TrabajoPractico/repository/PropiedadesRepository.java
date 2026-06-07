package tuti.TrabajoPractico.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tuti.TrabajoPractico.entity.Publicacion;


/**
 * CAPA: REPOSITORIO (Acceso a Datos / Antiguo DAO)
 * * FUNCIÓN PRINCIPAL: Es la canilla que saca y mete datos directamente en MySQL.
 * Es una interfaz, por lo que no lleva código de programación manual. Al heredar (extends) de
 * JpaRepository, Spring Data JPA nos regala los comandos básicos listos para usar:
 * * - .save(objeto)   ➔ Traduce a un INSERT de SQL para guardar.
 * - .findAll()      ➔ Traduce a un SELECT * FROM para traer todo.
 * - .findById(id)   ➔ Busca una fila por su llave primaria.
 */
@Repository // ➔ Le avisa a Spring que esta interfaz maneja el acceso a datos (MySQL)
public interface PropiedadesRepository extends JpaRepository<Publicacion, Long> {
    
	// En el futuro, acá declararemos consultas específicas (ej: buscar por direccion y ciudad).
}