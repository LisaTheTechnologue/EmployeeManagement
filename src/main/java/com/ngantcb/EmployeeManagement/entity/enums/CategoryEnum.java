package com.ngantcb.EmployeeManagement.entity.enums;

import javax.annotation.Nullable;
import java.util.Objects;

public enum CategoryEnum {
    CATEGORY1("Category1"),
    CATEGORY2("Category2"),
    CATEGORY3("Category3");

    private final String id;

    CategoryEnum(String id) {
        this.id = id;
    }

    @Nullable
    public static CategoryEnum fromId(String id){
        for (CategoryEnum value : CategoryEnum.values()) {
            if (Objects.equals(id, value.getId())) return value;
        }
        return null;
    }

    public String getId() {
        return id;
    }
}
