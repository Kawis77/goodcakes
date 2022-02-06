package com.goodcakes.web.model;

import com.goodcakes.dao.entity.RecipeEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

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
