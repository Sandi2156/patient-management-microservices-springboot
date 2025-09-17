package com.sandipanmahata.patient_service.service;

import com.sandipanmahata.patient_service.dto.PatientRequestDTO;
import com.sandipanmahata.patient_service.dto.PatientResponseDTO;
import com.sandipanmahata.patient_service.exception.DuplicateEmailException;
import com.sandipanmahata.patient_service.mapper.PatientMapper;
import com.sandipanmahata.patient_service.models.Patient;
import com.sandipanmahata.patient_service.repository.PatientRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {
    private final PatientRepository patientRepository;

    public PatientService(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    public List<PatientResponseDTO> getPatients() {
        List<Patient> patients = patientRepository.findAll();

        return patients.stream().map(PatientMapper::toDTO).toList();
    }

    public PatientResponseDTO addPatient(PatientRequestDTO patientRequestDTO) {

        if(patientRepository.existsByEmail(patientRequestDTO.getEmail())) {
            throw new DuplicateEmailException("Email already exists " + patientRequestDTO.getEmail());
        }

        Patient patient = patientRepository.save(PatientMapper.toModel(patientRequestDTO));
        return PatientMapper.toDTO(patient);
    }
}
