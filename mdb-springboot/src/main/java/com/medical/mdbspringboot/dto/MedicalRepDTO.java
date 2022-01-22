package com.medical.mdbspringboot.dto;

import java.util.List;

public class MedicalRepDTO {
	
	public String id;
	public String name;
	public List<String> drugs;

	public MedicalRepDTO()
	{
		
	}
	public MedicalRepDTO(String id,String name,List<String>drugs)
	{
		this.id=id;
		this.name=name;
		this.drugs=drugs;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getDrugs() {
		return drugs;
	}
	public void setDrugs(List<String> drugs) {
		this.drugs = drugs;
	}
	@Override
	public String toString() {
		return "MedicalRepDTO [id=" + id + ", name=" + name + ", drugs=" + drugs + "]";
	}

}
