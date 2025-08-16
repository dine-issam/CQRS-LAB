package com.example.msquerylibrary;

import com.example.coreapi.AxonConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({AxonConfig.class})
public class MsQueryLibraryApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsQueryLibraryApplication.class, args);
    }

}
