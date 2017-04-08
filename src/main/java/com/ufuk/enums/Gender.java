package com.ufuk.enums;

/**
 * Created by Ufuk on 8.04.2017.
 */
public enum Gender
{
    MR("MR"),
    MRS("MRS");

    private String value;

    Gender(String value)
    {
        this.value = value;
    }

    public String getValue()
    {
        return this.value;
    }
}
