package com.recargas.service;

import java.util.List;

import com.recargas.controller.dto.RecargaDTO;
import com.recargas.controller.dto.RecargaDTOIn;
import com.recargas.controller.dto.RecargaDTOResponse;

public interface IRecargaService {
	
	public List<RecargaDTO> consultarRecargas();
	
	public RecargaDTOResponse realizarRecarga(RecargaDTOIn recargaDTOIn);

}
