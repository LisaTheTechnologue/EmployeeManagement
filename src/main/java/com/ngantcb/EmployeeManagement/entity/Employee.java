package com.ngantcb.EmployeeManagement.entity;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@Table(name = "tbl_emp")
@Entity
@Data
public class Employee {

    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

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

    public String getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(String isDeleted) {
        this.isDeleted = isDeleted;
    }

    public Short getExperienceMonth() {
        return experienceMonth;
    }

    public void setExperienceMonth(Short experienceMonth) {
        this.experienceMonth = experienceMonth;
    }

    public Short getExperienceYear() {
        return experienceYear;
    }

    public void setExperienceYear(Short experienceYear) {
        this.experienceYear = experienceYear;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Date getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(Date joiningDate) {
        this.joiningDate = joiningDate;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNameAlias() {
        return nameAlias;
    }

    public void setNameAlias(String nameAlias) {
        this.nameAlias = nameAlias;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}