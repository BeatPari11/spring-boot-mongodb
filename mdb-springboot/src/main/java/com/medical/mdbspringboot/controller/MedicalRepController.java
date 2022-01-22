package com.medical.mdbspringboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.medical.mdbspringboot.dto.MedicalRepDTO;
import com.medical.mdbspringboot.service.MedicalRepService;


@RestController
@RequestMapping("/medicalrep")
public class MedicalRepController {

	@Autowired
	private MedicalRepService medicalrepservice;
	
	@GetMapping(value="/")
	public List<MedicalRepDTO> getAllRepresentative()
	{
	
		
	}
}
