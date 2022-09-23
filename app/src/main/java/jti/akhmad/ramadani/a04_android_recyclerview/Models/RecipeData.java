package jti.akhmad.ramadani.a04_android_recyclerview.Models;


public class RecipeData {
    private String name;
    private String description;
    private int image;
    private String details;

    public RecipeData(String name, String description, int image, String details){
        this.setName(name);
        this.setDescription(description);
        this.setImage(image);
        this.setDetails(details);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getImage(){
        return image;
    }

    public void setImage(int image){
        this.image = image;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}

