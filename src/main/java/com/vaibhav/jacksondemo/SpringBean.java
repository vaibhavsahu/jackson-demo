package com.vaibhav.jacksondemo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class SpringBean {
    private int id;
    private String name;

    @JsonCreator
    public SpringBean(@JsonProperty("id") int id,
                      @JsonProperty("theName") String name){
        this.id = id;
        this.name = name;
    }
}
