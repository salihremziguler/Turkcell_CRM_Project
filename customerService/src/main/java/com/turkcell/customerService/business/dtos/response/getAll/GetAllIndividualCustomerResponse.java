package com.turkcell.customerService.business.dtos.response.getAll;

import com.turkcell.commonpackage.utils.enums.GenderType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class GetAllIndividualCustomerResponse {
    private int id;
    private LocalDateTime createdDate;
    private String firstName;
    private String middleName;
    private String lastName;
    private LocalDate birthDate;
    private GenderType gender;
    private String fatherName;
    private String motherName;
    private String nationalityNo;
    private String mobilePhone;
    private String email;
    private String homePhone;
}
