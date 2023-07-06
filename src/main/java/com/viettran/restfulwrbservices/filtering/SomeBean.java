package com.viettran.restfulwrbservices.filtering;

import com.fasterxml.jackson.annotation.JsonFilter;
import lombok.Getter;
import lombok.RequiredArgsConstructor;


@Getter
@RequiredArgsConstructor
//@JsonIgnoreProperties(value = {"field1", "field2"})
@JsonFilter("SomeBeanFilter")
public class SomeBean {
    private final String field1;
    //    @JsonIgnore
    private final String field2;
    private final String field3;

    @Override
    public String toString() {
        return "SomeBean [field1=" + field1 + ", field2=" + field2 + ", field3=" + field3 + "]";
    }
}
