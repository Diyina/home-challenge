package response;

import model.Category;
import model.Pet;
import model.Status;
import model.Tags;

import java.util.List;

public class PetResponse {

    private int id;
    private Category category;
    private String name;
    private List<String> photoUrls;
    private List<Tags> tags;
    private Status status;

    public PetResponse() {
    }

    public int getId() {
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

}