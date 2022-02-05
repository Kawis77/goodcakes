package com.goodcakes.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ArticleModel {

    private Long id;
    private String author;
    private String title;
    private String secondTitle;
    private String contents;

}