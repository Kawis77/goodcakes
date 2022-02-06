package com.goodcakes.dao.entity;

import javax.persistence.*;

@Entity
public class ArticleEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String author;
    @Column(length = 350)
    private String title;
    @Column( length = 350)
    private String secondTitle;
    private String contents;


    public ArticleEntity() {
    }

    public ArticleEntity(Long id, String author, String title, String secondTitle, String contents) {
        this.id = id;
        this.author = author;
        this.title = title;
        this.secondTitle = secondTitle;
        this.contents = contents;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSecondTitle() {
        return secondTitle;
    }

    public void setSecondTitle(String secondTitle) {
        this.secondTitle = secondTitle;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }
}
