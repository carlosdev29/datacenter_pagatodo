package com.recargas.db.repository.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.recargas.controller.dto.RecargaDTO;
import com.recargas.controller.dto.RecargaDTOIn;
import com.recargas.db.entity.RecargaEntity;
import com.recargas.db.repository.IRecargasRepository;


@Repository
public class RecargaRepositoryImpl implements IRecargasRepository {
	
	private List<RecargaEntity>dbRecargas = new ArrayList<>();
	
	@Override
	public String insertarDataRecarga(RecargaDTOIn recarga) {
		// TODO Auto-generated method stub
		RecargaEntity recargaEntity = new RecargaEntity();
		recargaEntity.setAsesor(recarga.getAsesorName());
		recargaEntity.setOperador(recarga.getOperador());
		recargaEntity.setCantidad(recarga.getCantidadRecarga());
		recargaEntity.setValor(recarga.getValorRecarga());
		//dbRecargas.add(recargaEntity);
		return "ok";
	}
	
	
	@Override
	public List<RecargaEntity> consultAllRecargasDB() {
		RecargaEntity recargaEntity = new RecargaEntity();
		RecargaEntity recargaEntity2 = new RecargaEntity();
		recargaEntity.setAsesor("Dulce Isabella Sanz");
		recargaEntity.setOperador("Movistar");
		recargaEntity.setCantidad(1);
		recargaEntity.setValor(1500);
		dbRecargas.add(recargaEntity);
		recargaEntity2.setAsesor("Karla Malave");
		recargaEntity2.setOperador("Tigo");
		recargaEntity2.setCantidad(2);
		recargaEntity2.setValor(3500);
		dbRecargas.add(recargaEntity2);
		return dbRecargas;
	}
	
	
	

}
