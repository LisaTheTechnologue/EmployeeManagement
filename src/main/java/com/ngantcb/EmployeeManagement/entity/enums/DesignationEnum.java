package com.ngantcb.EmployeeManagement.entity.enums;

import javax.annotation.Nullable;
import java.util.Objects;

public enum DesignationEnum {
    DESIGNATION1("Designation1"),
    DESIGNATION2("Designation2");

    private final String id;

    DesignationEnum(String id) {
        this.id = id;
    }

    @Nullable
    public static DesignationEnum fromId(String id){
        for (DesignationEnum value : DesignationEnum.values()) {
            if (Objects.equals(id, value.getId())) return value;
        }
        return null;
    }

    public String getId() {
        return id;
    }
}
