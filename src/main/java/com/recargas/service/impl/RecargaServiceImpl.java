package com.recargas.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.recargas.controller.dto.RecargaDTO;
import com.recargas.controller.dto.RecargaDTOIn;
import com.recargas.controller.dto.RecargaDTOResponse;
import com.recargas.controller.dto.StatusResponse;
import com.recargas.db.entity.RecargaEntity;
import com.recargas.db.repository.IRecargasRepository;
import com.recargas.service.IRecargaService;


@Service
public class RecargaServiceImpl implements IRecargaService  {
	
	@Autowired
	private IRecargasRepository dbrecarga;
	
	@Override
	public List<RecargaDTO> consultarRecargas() {
		List<RecargaDTO>listaRecargaDTOs = new ArrayList<>();
		RecargaDTO recargaDTO = new RecargaDTO();
		List<RecargaEntity>listaRecargasEntitys = dbrecarga.consultAllRecargasDB();
		for (RecargaEntity recargaEntity : listaRecargasEntitys) {
			recargaDTO.setAsesor(recargaEntity.getAsesor());
			recargaDTO.setOperador(recargaEntity.getOperador());
			recargaDTO.setCantidad(recargaEntity.getCantidad());
			recargaDTO.setValor(recargaEntity.getValor());
			listaRecargaDTOs.add(recargaDTO);
		}
		return listaRecargaDTOs;
	}
	
	@Override
	public RecargaDTOResponse realizarRecarga(RecargaDTOIn recargaDTOIn) {
		// TODO Auto-generated method stub
		RecargaDTOResponse recargaDTOResponse = new RecargaDTOResponse();
		StatusResponse statusResponse = new StatusResponse();
		String responseInsertRecarga = this.dbrecarga
				.insertarDataRecarga(recargaDTOIn);
		if (responseInsertRecarga.equals("ok")) {
			recargaDTOResponse.setAsesorName(recargaDTOIn.getAsesorName());
			recargaDTOResponse.setOperador(recargaDTOIn.getOperador());
			recargaDTOResponse.setCantidadRecarga(recargaDTOIn.getCantidadRecarga());
			recargaDTOResponse.setValorRecarga(recargaDTOIn.getValorRecarga());
			statusResponse.setCod("201");
			statusResponse.setMessage("ok");
			recargaDTOResponse.setStatusResponse(statusResponse);
		}else{
			recargaDTOResponse.setAsesorName("Sin data");
			recargaDTOResponse.setOperador("Sin data");
			recargaDTOResponse.setCantidadRecarga(0);
			recargaDTOResponse.setValorRecarga(0);
			statusResponse.setCod("400");
			statusResponse.setMessage("error");
			recargaDTOResponse.setStatusResponse(statusResponse);
			
		}
		return recargaDTOResponse;
	}

}
