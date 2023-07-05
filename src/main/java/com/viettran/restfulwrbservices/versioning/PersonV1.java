package com.viettran.restfulwrbservices.versioning;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class PersonV1 {
    private String name;

    public PersonV1(String name) {
        super();
        this.name = name;
    }

    @Override
    public String toString() {
        return "PersonV1 [name=" + name + "]";
    }
}
