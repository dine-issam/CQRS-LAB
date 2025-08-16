package com.esi.mscommandlibrarybook;

import com.example.coreapi.AxonConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({AxonConfig.class})
public class MsCommandLibraryBookApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsCommandLibraryBookApplication.class, args);
    }

}
