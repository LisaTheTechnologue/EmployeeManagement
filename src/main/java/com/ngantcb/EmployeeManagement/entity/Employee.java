package com.ngantcb.EmployeeManagement.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Table(name = "tbl_emp")
@Entity
@Data
@NoArgsConstructor
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull(message = "First Name cannot be null")
    @Column(name = "FIRST_NAME", nullable = false, length = 45)
    private String firstName;

    @Column(name = "MIDDLE_NAME", length = 45)
    private String middleName;

    @Column(name = "LAST_NAME", nullable = false, length = 45)
    @NotNull(message = "Last Name cannot be null")
    private String lastName;

    @Column(name = "NAME_ALIAS", length = 45)
    private String nameAlias;

    @Column(name = "GENDER", length = 45)
    private String gender;

    @Column(name = "DOB")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dob;

    @Column(name = "JOINING_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date joiningDate;

    @NotNull(message = "Department cannot be null")
    @Column(name = "DEPARTMENT", length = 45)
    private String department;

    @Column(name = "CATEGORY", nullable = false, length = 45)
    @NotNull(message = "Category cannot be null")
    private String category;

    @Column(name = "EMAIL", nullable = false)
    @NotNull(message = "Email cannot be null")
    @Email
    private String email;

    @Column(name = "PHONE_NUMBER", length = 11)
    private String phoneNumber;

    @Column(name = "MARITAL_STATUS", length = 10)
    private String maritalStatus;

    @Column(name = "ADDRESS")
    private String address;

    @Column(name = "EXPERIENCE_YEAR")
    private Short experienceYear;

    @Column(name = "EXPERIENCE_MONTH")
    private Short experienceMonth;

    @Column(name = "IS_DELETED", length = 1)
    private String isDeleted;
}