package com.recargas.db.repository;

import java.util.List;

import com.recargas.controller.dto.RecargaDTOIn;
import com.recargas.db.entity.RecargaEntity;

public interface IRecargasRepository {
	
	List<RecargaEntity>consultAllRecargasDB();
	
	String insertarDataRecarga(RecargaDTOIn recargaEntity);

}
