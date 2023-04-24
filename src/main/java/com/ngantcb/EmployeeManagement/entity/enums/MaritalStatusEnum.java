package com.ngantcb.EmployeeManagement.entity.enums;

import javax.annotation.Nullable;
import java.util.Objects;

public enum MaritalStatusEnum {
    MARRIED("Married"),
    SINGLE("Single"),
    DIVORCED("Divorced");

    private final String id;

    MaritalStatusEnum(String id) {
        this.id = id;
    }

    @Nullable
    public static MaritalStatusEnum fromId(String id){
        for (MaritalStatusEnum value : MaritalStatusEnum.values()) {
            if (Objects.equals(id, value.getId())) return value;
        }
        return null;
    }

    public String getId() {
        return id;
    }
}
