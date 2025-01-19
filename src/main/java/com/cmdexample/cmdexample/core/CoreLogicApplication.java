package com.cmdexample.cmdexample.core;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.ResourceUtils;

import com.cmdexample.cmdexample.core.configs.Configs;
import com.cmdexample.cmdexample.core.schemas.Catalog;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

@Component
public class CoreLogicApplication {
    private static Logger logger = LoggerFactory.getLogger(CoreLogicApplication.class);
    @Autowired
    private Configs configs;

    private String loadBooks() throws Exception {
        File file = ResourceUtils.getFile("classpath:" + configs.getBooksXmlPath());
        return new String(Files.readAllBytes(file.toPath()), StandardCharsets.UTF_8);
    }

    private Catalog unmarchalCatalog(String data) throws JsonMappingException, JsonProcessingException {
        return new XmlMapper().readValue(data, Catalog.class);
    }

    public void run() {
        try {
            String booksXml = this.loadBooks();
            Catalog catalog = unmarchalCatalog(booksXml);
            logger.info("Catalog: {}", catalog);
        } catch (JsonProcessingException e) {
            logger.error("Cannot unmarshall catalog: {}", e);
        }
        catch (Exception e) {
            logger.error("Cannot reach file {}", e);
        }
    }
}
