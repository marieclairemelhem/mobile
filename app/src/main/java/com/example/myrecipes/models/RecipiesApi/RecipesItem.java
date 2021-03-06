package com.example.myrecipes.models.RecipiesApi;


import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class RecipesItem implements Serializable{
    @SerializedName("_id")
    private String id;

    @SerializedName("label")
    private String label;

    @SerializedName("image")
    private String img;

    @SerializedName("ingredients")
    private List<Ingredients> ingredientsList;

    @SerializedName("url")
    private String url;

    public RecipesItem(String img, List<Ingredients> ingredientsList,String name  , String url) {
        this.label=name;
        this.img=img;
        this.ingredientsList=ingredientsList;
        this.url=url;
    }

    public RecipesItem(String img) {
        this.img=img;
    }

    public String getId() {
        return this.id=id;
    }

    public String getName(){
        return label;
    }
    public String getImg(){
        return img;
    }
    public List<Ingredients> getIngredientsList(){
        return ingredientsList;

    }
    public String getUrl(){
        return url;
    }
}
