package com.arun.hospital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arun.hospital.dto.HospitalDto;
import com.arun.hospital.entity.HospitalEntity;
import com.arun.hospital.service.HospitalService;

@RestController
public class HospitalController {
	@Autowired
	public HospitalService hospitalService;

	@PostMapping("/createHospital")
	public HospitalEntity createHospital(HospitalDto hospitalDto) {
		return hospitalService.createPatient(hospitalDto);

	}

	@GetMapping("/getAllHospitalDetails")
	public List<HospitalEntity> getAllHospitalDetails() {
		return hospitalService.getAllHospitalDetails();
	}

}
