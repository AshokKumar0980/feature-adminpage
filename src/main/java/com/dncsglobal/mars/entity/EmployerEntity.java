package com.dncsglobal.mars.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Employer_Details")
public class EmployerEntity {
    @Id
    private String employeeId;
    private String userId;
    private String companyName;
    private String companyWebsite;
    private String contactNumber;
}
