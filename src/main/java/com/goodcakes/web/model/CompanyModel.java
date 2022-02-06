package com.goodcakes.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CompanyModel {

    private Long id;
    private String login;
    private String password;
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
    private List<Integer> rating;
    private List<String> comments;
    private List<ArticleModel> articleModels;



}
