package builder;

import model.Category;
import model.Pet;
import model.Status;
import model.Tags;

import java.util.List;

public class PetBuilder {

    private Integer id;
    private Category category;
    private String name;
    private List<String> photoUrls;
    private List<Tags> tags;
    private Status status;

    public Pet build() {
        return new Pet(this);
    }

    public Integer getId() {
        return id;
    }

    public Category getCategory() {
        return category;
    }

    public String getName() {
        return name;
    }

    public List<String> getPhotoUrls() {
        return photoUrls;
    }

    public List<Tags> getTags() {
        return tags;
    }

    public Status getStatus() {
        return status;
    }

    public PetBuilder id(int id) {
        this.id = id;
        return this;
    }

    public PetBuilder category(Category category) {
        this.category = category;
        return this;
    }

    public PetBuilder name(String name) {
        this.name = name;
        return this;
    }

    public PetBuilder photoUrls(List<String> photoUrls) {
        this.photoUrls = photoUrls;
        return this;
    }

    public PetBuilder tags(List<Tags> tags) {
        this.tags = tags;
        return this;
    }

    public PetBuilder status(Status status) {
        this.status = status;
        return this;
    }
}