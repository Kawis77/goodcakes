package com.goodcakes.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RecipeModel {

    private Long id;
    private String tittle;
    private String ingredients;
    private String description;
}
