package com.arun.hospital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arun.hospital.dto.PatientDto;
import com.arun.hospital.entity.PatientEntity;
import com.arun.hospital.service.PatientService;

@RestController
@RequestMapping("patient")
public class PatientController {
	@Autowired
	private PatientService patientService;

	@PostMapping("/createPatient")
	public PatientEntity createPatient(PatientDto patientDto) {
		return patientService.createPatient(patientDto);
	}

	@GetMapping("/getAllDetails")
	public List<PatientEntity> getAllPatientDetails() {
		return patientService.getAllPatientDetails();
	}
}
