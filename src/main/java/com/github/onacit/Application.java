package com.github.onacit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class Application {

    public static void main(String[] args) throws IOException {

        // Not available in JDK 11
        //javax.xml.bind.DataTypeConverter.parseBoolean("true");

        // Available only in JDK 11
        new java.io.ByteArrayOutputStream().writeBytes(new byte[0]);

        SpringApplication.run(Application.class, args);
    }
}
