package model;

import builder.PetBuilder;

import java.util.List;
import java.util.Objects;

public class Pet{

    private Integer id;
    private Category category;
    private String name;
    private List<String> photoUrls;
    private List<Tags> tags;
    private Status status;

    public Pet() {
    }

    public Pet(PetBuilder builder){
        Objects.requireNonNull(builder.getId(), "Id Field is required");
        this.id = builder.getId();
        this.name = builder.getName();
        this.photoUrls = builder.getPhotoUrls();
        this.category = builder.getCategory();
        this.status = builder.getStatus();
        this.tags = builder.getTags();
    }



}