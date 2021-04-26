package com.arun.hospital.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.arun.hospital.entity.HospitalEntity;

@Repository
public interface HospitalRepository extends JpaRepository<HospitalEntity, Long> {

}
