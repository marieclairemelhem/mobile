package com.example.myrecipes.models;


import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Recipe implements Serializable{
 @SerializedName("recipe")
    private RecipesItem recipeobj;

 public RecipesItem getRecipeobj (){
     return recipeobj;
 }
}