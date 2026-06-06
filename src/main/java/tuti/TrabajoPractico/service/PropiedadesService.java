package tuti.TrabajoPractico.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tuti.TrabajoPractico.repository.PropiedadesRepository;


/**
 * CAPA: SERVICIO (Lógica de Negocio)
 * * FUNCIÓN PRINCIPAL: Es el cerebro inteligente del Trabajo Práctico.
 * No sabe cómo se conecta MySQL ni sabe cómo es el HTML. Su único trabajo es aplicar las reglas
 * que te pidió el profesor en el enunciado.
 * * EJEMPLOS DE LOGICA QUE DEBEMOS PROGRAMAR ACÁ ADENTRO:
 * 1. Controlar que no haya dos propiedades activas con la misma dirección y ciudad antes de guardar.
 * 2. Bloquear la eliminación si la propiedad tiene un contrato vigente.
 * 3. Hacer la "Baja Lógica" cambiando el estado de 'eliminada' de false a true.
 */

@Service // ➔ Le avisa a Spring que acá adentro va a vivir la lógica del negocio
public class PropiedadesService {

	
	// El @Autowired le dice a Spring: "Enchufame el acceso a datos acá adentro para poder usarlo"
    @Autowired // ➔ Inyecta automáticamente el puente de acceso a la base de datos
    private PropiedadesRepository propiedadesRepository;

    // El código con los filtros y condiciones lógicas lo dejamos vacío por ahora
}