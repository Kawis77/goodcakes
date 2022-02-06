package com.goodcakes.dao.entity;

import javax.persistence.*;

@Entity
public class RecipeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 350)
    private String tittle;
    @Column(length = 1000)
    private String ingredients;
    private String description;

    public RecipeEntity() {
    }

    public RecipeEntity(Long id, String tittle, String ingredients, String description) {
        this.id = id;
        this.tittle = tittle;
        this.ingredients = ingredients;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
