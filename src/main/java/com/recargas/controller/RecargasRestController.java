package com.recargas.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.recargas.controller.dto.RecargaDTO;

@RestController
@RequestMapping(value = "/recargaonline")
@CrossOrigin(origins = "http://localhost:4200/")
public class RecargasRestController {
	
	
	@GetMapping(value = "/recargas")
	public List<RecargaDTO>listClients(){
		RecargaDTO recargaDTO = new RecargaDTO();
		recargaDTO.setOperador("Claro");
		recargaDTO.setAsesor("Carlos Sanz");
		recargaDTO.setCantidad(1);
		recargaDTO.setValor(100);
		RecargaDTO recargaDTO2 = new RecargaDTO();
		recargaDTO2.setOperador("Movistar");
		recargaDTO2.setAsesor("Dulce Isabella Sanz");
		recargaDTO2.setCantidad(1);
		recargaDTO2.setValor(200);
		List<RecargaDTO>listaRecargas = new ArrayList<>();
		listaRecargas.add(recargaDTO);
		listaRecargas.add(recargaDTO2);
		return listaRecargas;
	}

}
