package com.guppy.core.domain.enums;

/**
 * Created by kanghonggu on 2017. 7. 5..
 */
public enum Status {

    ACTIVE("active"),
    INACTIVE("inactive"),
    DELETE("delete");

    private String value;

    Status(String value) {
        this.value = value;
    }

    public String getValue() { return value; }

}
