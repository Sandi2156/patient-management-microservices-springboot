package com.sandipanmahata.patient_service.dto;

import java.util.List;

public class PagedPatientResponseDTO {
    private List<PatientResponseDTO> patientResponseDTOS;
    private int page;
    private int size;
    private int totalPages;
    private int totalElements;

    public PagedPatientResponseDTO() {}

    public PagedPatientResponseDTO(List<PatientResponseDTO> patientResponseDTOS, int page, int size, int totalPages, int totalElements) {
        this.patientResponseDTOS = patientResponseDTOS;
        this.page = page;
        this.size = size;
        this.totalPages = totalPages;
        this.totalElements = totalElements;
    }

    public List<PatientResponseDTO> getPatientResponseDTOS() {
        return patientResponseDTOS;
    }

    public void setPatientResponseDTOS(List<PatientResponseDTO> patientResponseDTOS) {
        this.patientResponseDTOS = patientResponseDTOS;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public int getTotalElements() {
        return totalElements;
    }

    public void setTotalElements(int totalElements) {
        this.totalElements = totalElements;
    }
}
