package com.medical.mdbspringboot.service;

import java.util.List;

import com.medical.mdbspringboot.model.MedicalRep;

public interface MedicalRepService {
	List<MedicalRep> findAll();
	MedicalRep findByRepresentativeId(String id);
	List<MedicalRep> findAllRepresentative();
	void deleteRepresentativeById(String id);
	

}
