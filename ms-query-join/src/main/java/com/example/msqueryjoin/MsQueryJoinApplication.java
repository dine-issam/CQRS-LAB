package com.example.msqueryjoin;

import com.example.coreapi.AxonConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({AxonConfig.class})

public class MsQueryJoinApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsQueryJoinApplication.class, args);
    }

}
