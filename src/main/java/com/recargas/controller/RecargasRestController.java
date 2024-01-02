package com.recargas.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.recargas.controller.dto.RecargaDTO;
import com.recargas.controller.dto.RecargaDTOIn;
import com.recargas.controller.dto.RecargaDTOResponse;
import com.recargas.controller.dto.StatusResponse;
import com.recargas.service.IRecargaService;

@RestController
@RequestMapping(value = "/recargaonline")
@CrossOrigin(origins = "http://localhost:4200/")
public class RecargasRestController {
	
	@Autowired
	private IRecargaService apiReacarga;
	
	
	@GetMapping(value = "/recargas")
	public List<RecargaDTO>listClients(){
		List<RecargaDTO>listaRecargas = this.apiReacarga.consultarRecargas();
		return listaRecargas;
	}
	
	
	@PostMapping(value = "/doRecarga")
	public RecargaDTOResponse saveRecarga(RecargaDTOIn recargaDTOIn ) {
		RecargaDTOResponse recargaDTOResponse = this.apiReacarga
				.realizarRecarga(recargaDTOIn);	
		return recargaDTOResponse;
	}

}
