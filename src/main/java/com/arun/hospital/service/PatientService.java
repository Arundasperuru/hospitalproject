package com.arun.hospital.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arun.hospital.dto.PatientDto;
import com.arun.hospital.entity.PatientEntity;
import com.arun.hospital.repository.PatientRepository;

@Service
public class PatientService {
	@Autowired
	private PatientRepository patientRepository;

	public PatientEntity createPatient(PatientDto patientDto) {
		PatientEntity patientEntity = new PatientEntity();
		patientEntity.setPatientId(patientDto.getPatientId());
		patientEntity.setFirstName(patientDto.getFirstName());
		patientEntity.setLastName(patientDto.getLastName());
		patientEntity.setAadharNumber(patientDto.getAadharNumber());
		patientEntity.setMobileNumber(patientDto.getMobileNumber());
		patientEntity.setAddress(patientDto.getAddress());
		return patientRepository.save(patientEntity);

	}

	public List<PatientEntity> getAllPatientDetails() {
		return patientRepository.findAll();
	}

}
