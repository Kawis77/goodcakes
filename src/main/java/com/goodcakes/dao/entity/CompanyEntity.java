package com.goodcakes.dao.entity;

import javax.persistence.*;
import javax.validation.constraints.Email;
import java.util.List;

@Entity
public class CompanyEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String login;
    private String password;
    @Email
    private String email;
    private String companyName;
    private String ownerName;
    private String ownerSurname;
    private Integer phoneNumber;
    private String district;
    private String city;
    private String street;
    private Integer numberOfStreet;
    private Integer zipCode;
    private String description;
    @ElementCollection
    private List<Integer> rating;
    @ElementCollection
    private List<String> comments;
    @OneToMany
    private List<ArticleEntity> articleEntities;
    @OneToMany
    private List<RecipeEntity> recipeEntities;

    public CompanyEntity() {
    }

    public CompanyEntity(Long id, String login, String password, @Email String email, String companyName, String ownerName, String ownerSurname, Integer phoneNumber, String district, String city, String street, Integer numberOfStreet, Integer zipCode, String description, List<Integer> rating, List<String> comments, List<ArticleEntity> articleEntities, List<RecipeEntity> recipeEntities) {
        this.id = id;
        this.login = login;
        this.password = password;
        this.email = email;
        this.companyName = companyName;
        this.ownerName = ownerName;
        this.ownerSurname = ownerSurname;
        this.phoneNumber = phoneNumber;
        this.district = district;
        this.city = city;
        this.street = street;
        this.numberOfStreet = numberOfStreet;
        this.zipCode = zipCode;
        this.description = description;
        this.rating = rating;
        this.comments = comments;
        this.articleEntities = articleEntities;
        this.recipeEntities = recipeEntities;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getOwnerSurname() {
        return ownerSurname;
    }

    public void setOwnerSurname(String ownerSurname) {
        this.ownerSurname = ownerSurname;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Integer getNumberOfStreet() {
        return numberOfStreet;
    }

    public void setNumberOfStreet(Integer numberOfStreet) {
        this.numberOfStreet = numberOfStreet;
    }

    public Integer getZipCode() {
        return zipCode;
    }

    public void setZipCode(Integer zipCode) {
        this.zipCode = zipCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Integer> getRating() {
        return rating;
    }

    public void setRating(List<Integer> rating) {
        this.rating = rating;
    }

    public List<String> getComments() {
        return comments;
    }

    public void setComments(List<String> comments) {
        this.comments = comments;
    }

    public List<ArticleEntity> getArticleEntities() {
        return articleEntities;
    }

    public void setArticleEntities(List<ArticleEntity> articleEntities) {
        this.articleEntities = articleEntities;
    }

    public List<RecipeEntity> getRecipeEntities() {
        return recipeEntities;
    }

    public void setRecipeEntities(List<RecipeEntity> recipeEntities) {
        this.recipeEntities = recipeEntities;
    }
}
