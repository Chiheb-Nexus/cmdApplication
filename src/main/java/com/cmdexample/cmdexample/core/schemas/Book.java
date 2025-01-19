package com.cmdexample.cmdexample.core.schemas;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import lombok.Getter;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Book {
    @JacksonXmlProperty(localName = "id", isAttribute = true)
    @Getter
    private String id;

    @JacksonXmlProperty(localName = "author")
    @Getter
    private String author;

    @JacksonXmlProperty(localName = "genre")
    @Getter
    private String genre;

    @JacksonXmlProperty(localName = "title")
    @Getter
    private String title;

    @JacksonXmlProperty(localName = "price")
    @Getter
    private float price;

    @JacksonXmlProperty(localName = "publish_date")
    @Getter
    private Date publishDate;

    @JacksonXmlProperty(localName = "description")
    @Getter
    private String description;
}
