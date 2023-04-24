package com.ngantcb.EmployeeManagement.entity;

import com.ngantcb.EmployeeManagement.entity.enums.*;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

@Table(name = "tbl_emp")
@Entity
@Data
public class Employee implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    @Column(name = "GENDER", length = 10)
    private String gender;

    @Column(name = "DOB")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dob;

    @Column(name = "JOINING_DATE")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
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

    @Column(name = "DESIGNATION", length = 45)
    private String designation;

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

    public Employee() {
    }

    public GenderEnum getGenderEnum() {
        return gender == null ? GenderEnum.OTHER : GenderEnum.fromId(gender);
    }

    public void setGenderEnum(GenderEnum gender) {
        this.gender = gender == null ? null : gender.getId();
    }
    public DepartmentEnum getDepartmentEnum() {
        return department == null ? DepartmentEnum.DEPARTMENT1 : DepartmentEnum.fromId(department);
    }

    public void setDepartmentEnum(DepartmentEnum department) {
        this.department = department == null ? null : department.getId();
    }
    public CategoryEnum getCategoryEnum() {
        return category == null ? CategoryEnum.CATEGORY1 : CategoryEnum.fromId(category);
    }

    public void setCategoryEnum(CategoryEnum category) {
        this.category = category == null ? null : category.getId();
    }
    public DesignationEnum getDesignationEnum() {
        return designation == null ? DesignationEnum.DESIGNATION1 : DesignationEnum.fromId(designation);
    }

    public void setDesignationEnum(DesignationEnum designation) {
        this.designation = designation == null ? null : designation.getId();
    }
    public MaritalStatusEnum getMaritalStatusEnum() {
        return maritalStatus == null ? MaritalStatusEnum.SINGLE : MaritalStatusEnum.fromId(maritalStatus);
    }

    public void setMaritalStatusEnum(MaritalStatusEnum maritalStatus) {
        this.maritalStatus = maritalStatus == null ? null : maritalStatus.getId();
    }
}