package com.medical.mdbspringboot.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.medical.mdbspringboot.model.MedicalRep;
import com.medical.mdbspringboot.repository.MedicalRepository;
import com.medical.mdbspringboot.service.MedicalRepService;

public class MedicalRepServiceImpl implements MedicalRepService {

	@Autowired
	private MedicalRepository medicalrepository;
	
	@Override
	public List<MedicalRep> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MedicalRep findByRepresentativeId(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MedicalRep> findAllRepresentative() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteRepresentativeById(String id) {
		// TODO Auto-generated method stub
		
	}

	
}
