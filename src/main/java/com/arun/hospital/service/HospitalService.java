package com.arun.hospital.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arun.hospital.dto.HospitalDto;
import com.arun.hospital.entity.HospitalEntity;
import com.arun.hospital.repository.HospitalRepository;

@Service
public class HospitalService {
	@Autowired
	private HospitalRepository hospitalRepository;

	public HospitalEntity createPatient(HospitalDto hospitalDto) {
		HospitalEntity hospitalEntity = new HospitalEntity();
		hospitalEntity.setHospitalId(hospitalDto.getHospitalId());
		hospitalEntity.setHospitalName(hospitalDto.getHospitalName());
		hospitalEntity.setContactNumber(hospitalDto.getContactNumber());
		hospitalEntity.setAddress(hospitalDto.getAddress());

		return hospitalRepository.save(hospitalEntity);
	}

	public List<HospitalEntity> getAllHospitalDetails() {
		return hospitalRepository.findAll();
	}
}
