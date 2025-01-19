package com.cmdexample.cmdexample.core.schemas;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import lombok.Getter;
import lombok.Setter;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Book {
    @JacksonXmlProperty(localName = "id", isAttribute = true)
    @Getter
    @Setter
    private String id;

    @JacksonXmlProperty(localName = "author")
    @Getter
    @Setter
    private String author;

    @JacksonXmlProperty(localName = "genre")
    @Getter
    @Setter
    private String genre;

    @JacksonXmlProperty(localName = "title")
    @Getter
    @Setter
    private String title;

    @JacksonXmlProperty(localName = "price")
    @Getter
    @Setter
    private float price;

    @JacksonXmlProperty(localName = "publish_date")
    @Getter
    @Setter
    private Date publishDate;

    @JacksonXmlProperty(localName = "description")
    @Getter
    @Setter
    private String description;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
}
