package ru.sergie.json;

import com.fasterxml.jackson.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@JsonAutoDetect
//@JsonRootName(value = "Cat")
@JsonPropertyOrder({"age", "name"})
class Cat
{
    @JsonGetter(value = "secretName")
    public String getSecretName() {
        return secretName;
    }
    @JsonSetter("secretName")
    public void setSecretName(String secretName) {
        this.secretName = secretName;
    }

    public String name;
    public int age;
    private String secretName;
    @JsonIgnore
    public int weight;
    List<Integer> list = Arrays.asList(1, 2,3);
    Cat(){}
}