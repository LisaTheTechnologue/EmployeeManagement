package com.ngantcb.EmployeeManagement.entity.enums;

import javax.annotation.Nullable;
import java.util.Objects;

public enum GenderEnum {
    MALE("Male"),
    FEMALE("Female"),
    OTHER("Other");

    private final String id;

    GenderEnum(String id) {
        this.id = id;
    }

    @Nullable
    public static GenderEnum fromId(String id){
        for (GenderEnum value : GenderEnum.values()) {
            if (Objects.equals(id, value.getId())) return value;
        }
        return null;
    }

    public String getId() {
        return id;
    }
}
